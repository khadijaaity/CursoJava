package poo.empleado;

abstract class Persona {

	private String nombre;

	public Persona(String nom) {
		nombre = nom;
	}

	public String dameNombre() {// GETTER nombre return nombre
		return nombre;
	}

	public abstract String dameDescription();

}