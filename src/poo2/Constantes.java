package poo2;

public class Constantes {

	public static void main(String[] args) {

		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Marta");
		Empleados trabajador3 = new Empleados("Carla");
		Empleados trabajador4 = new Empleados("Juan");

		trabajador1.cambiaSeccion("RRHH");

		System.out.println(
				trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos()
						+ "\n" + trabajador3.devuelveDatos() + "\n"
						+ trabajador4.devuelveDatos() + "\n");

		System.out.println(Empleados.dameIdSiguiente());
	}

}

class Empleados {

	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente = 1;

	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administración";
		id = idSiguiente;
		idSiguiente++;

	}

	public static String dameIdSiguiente() {
		return "EL IdSiguiente es: " + idSiguiente;
	}

	public void cambiaSeccion(String seccion) {// SETTER
		this.seccion = seccion;
	}

	public String devuelveDatos() { // GETTER
		return "EL nombre es: " + nombre + ". La sección es " + seccion
				+ " y Id = " + id;
	}

	public String getNombre() { // GETTER Nombre
		return nombre;
	}

}