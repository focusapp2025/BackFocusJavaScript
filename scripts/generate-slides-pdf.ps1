# Generate slides PDF using Chrome or Edge in headless mode
# Usage:
#   .\generate-slides-pdf.ps1               # uses chrome/msedge from PATH or common install locations
#   .\generate-slides-pdf.ps1 -BrowserPath "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"
#
# If no browser is found, the script will instruct you to open slides/slides.html and print to PDF manually.

$html = Join-Path $PSScriptRoot "..\slides\slides.html"
$pdf = Join-Path $PSScriptRoot "..\slides\FocusApp_Presentation.pdf"

param(
    [string]$BrowserPath
)

Write-Host "Generating PDF from $html -> $pdf"

# Helper: try a path or command name and return the executable path if found
function Find-BrowserExecutable([string]$nameOrPath) {
    if ([string]::IsNullOrWhiteSpace($nameOrPath)) { return $null }
    # If it's an absolute path and the file exists, return it
    if (Test-Path $nameOrPath) { return (Resolve-Path $nameOrPath).Path }
    # Otherwise try Get-Command (checks PATH)
    $cmd = Get-Command $nameOrPath -ErrorAction SilentlyContinue
    if ($cmd) { return $cmd.Path }
    return $null
}

$foundPath = $null

if ($BrowserPath) {
    $foundPath = Find-BrowserExecutable $BrowserPath
    if (-not $foundPath) {
        Write-Host "Provided -BrowserPath '$BrowserPath' was not found." -ForegroundColor Yellow
    }
}

if (-not $foundPath) {
    # Try simple command names in PATH first
    $candidates = @("chrome", "msedge")
    foreach ($c in $candidates) {
        $p = Find-BrowserExecutable $c
        if ($p) { $foundPath = $p; break }
    }
}

if (-not $foundPath) {
    # Check common Windows install locations for Chrome and Edge
    $commonPaths = @(
        "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe",
        "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
        "C:\\Program Files\\Microsoft\\Edge\\Application\\msedge.exe",
        "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe"
    )
    foreach ($p in $commonPaths) {
        if (Test-Path $p) { $foundPath = $p; break }
    }
}

if (-not $foundPath) {
    Write-Host "Chrome/Edge not found in PATH or common install locations." -ForegroundColor Yellow
    Write-Host "Options:"
    Write-Host "  1) Install Chrome or Edge and ensure the executable is on PATH, or"
    Write-Host "  2) Run this script with -BrowserPath '<full path to chrome/msedge>'"
    Write-Host "  3) Open slides/slides.html in your browser and print to PDF manually."
    exit 2
}

Write-Host "Using browser executable: $foundPath"

# Build file:// URI for the HTML file and call the browser's headless print-to-pdf
$htmlFull = (Get-Item $html).FullName
$fileUri = "file:///" + ($htmlFull -replace '\\','/')

Start-Process -FilePath $foundPath -ArgumentList "--headless","--disable-gpu","--print-to-pdf=$pdf","$fileUri" -NoNewWindow -Wait

if (Test-Path $pdf) {
    Write-Host "PDF generado en: $pdf" -ForegroundColor Green
} else {
    Write-Host "El navegador terminó pero el PDF no fue creado. Abre $html en el navegador y usa imprimir->Guardar como PDF." -ForegroundColor Yellow
}
