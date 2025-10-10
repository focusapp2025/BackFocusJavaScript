# Small helper script with examples to test the API from PowerShell

Write-Host "GET all usuarios"
Invoke-RestMethod -Method Get -Uri http://localhost:8080/api/usuarios | ConvertTo-Json -Depth 5 | Write-Host

Write-Host "GET usuario id=1"
Invoke-RestMethod -Method Get -Uri http://localhost:8080/api/usuarios/1 | ConvertTo-Json -Depth 5 | Write-Host

# Create a user
$body = @{ nombre='prueba'; clave='pass'; nickname='prueba1'; edad=19; telefono=3111111111; carrera='Test' } | ConvertTo-Json
Invoke-RestMethod -Method Post -Uri http://localhost:8080/api/usuarios -Body $body -ContentType 'application/json' | ConvertTo-Json -Depth 5 | Write-Host

Write-Host "Done"
