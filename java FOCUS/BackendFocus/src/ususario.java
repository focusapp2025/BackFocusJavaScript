public class ususario {
	String nombre;
	String email;
	boolean esAdmin;

	// Constructor para usuario normal
	public ususario(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
		this.esAdmin = false;
	}

	// Constructor para usuario admin
	public ususario(String nombre, String email, boolean esAdmin) {
		this.nombre = nombre;
		this.email = email;
		this.esAdmin = esAdmin;
	}
	
	// Método para mostrar los datos del usuario
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Email: " + email);
		if (esAdmin) {
			System.out.println("Tipo: Administrador");
		} else {
			System.out.println("Tipo: Usuario normal");
		}
	}
	
	// Método para cambiar el email
	public void cambiarEmail(String nuevoEmail) {
		this.email = nuevoEmail;
	}
	
	// Método para saber si es admin
	public boolean esAdministrador() {
		return esAdmin;
	}
}

