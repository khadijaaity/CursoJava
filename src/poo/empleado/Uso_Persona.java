package poo.empleado;

public class Uso_Persona {

	public static void main(String[] args) {
		Persona[] personas = new Persona[3];

		personas[0] = new Empleado("Luis", 50000, 208, 02, 25);

		personas[1] = new Alumno("Ana", "Biología");

		Jefe jefe = new Jefe("Víctor", 56000, 2020, 01, 23);

		jefe.estableceIncentivo(100000);

		personas[2] = jefe;

		for (Persona p : personas) {
			System.out.println(p.dameNombre() + ", " + p.dameDescription());
		}
	}

}
