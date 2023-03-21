package test;

public class Alumno {
	int id;
	String nombre;
	String apellido;
	
	public Alumno(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public void mostrarNombre() {
		System.out.println("Hola mi nombre es " + nombre);
	}
	
	
}
