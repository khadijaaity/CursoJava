package poo;

import java.util.Arrays;

public class UsoEmpleado {

	public static void main(String[] args) {

		Jefe jefe_RRHH = new Jefe("Juan", 55000, 2006, 9, 25);

		jefe_RRHH.estableceIncentivo(2570);

		Empleado[] misEmpleados = new Empleado[6];

		misEmpleados[0] = new Empleado("Paco", 85000, 1990, 12, 30);

		misEmpleados[1] = new Empleado("Ana", 175000, 2002, 02, 05);

		misEmpleados[2] = new Empleado("María", 105000, 1999, 05, 22);

		misEmpleados[3] = new Empleado("Antonio");

		misEmpleados[4] = jefe_RRHH; // polimorfismo en accion. Principio de
										// sustitución

		misEmpleados[5] = new Jefe("Marta", 95000, 1999, 05, 27);

		Jefe jefa_Finanzas = (Jefe) misEmpleados[5];

		jefa_Finanzas.estableceIncentivo(50000);
		/*
		 * Empleado director_comercial = new Jefe("Sandra", 85000, 2013, 05,
		 * 05);
		 * 
		 * Comparable ejemplo = new Empleado("Pau", 90000, 2015, 06, 07);
		 * 
		 * if (director_comercial instanceof Empleado) {
		 * System.out.println("Es de tipo Jefe"); }
		 * 
		 * if (ejemplo instanceof Comparable) {
		 * System.out.println("Implementa la interfaz comparable"); }
		 */

		System.out.println(jefa_Finanzas.tomarDecisiones(
				"\nDar más días de vacaciones a los empleados\n"));

		System.out.println(
				"El Jefe " + jefa_Finanzas.dameNombre() + "tiene un bonus de: "
						+ jefa_Finanzas.establece_bonus(500) + "\n");

		System.out.println(misEmpleados[3].dameNombre() + "tiene yn bonus de: "
				+ misEmpleados[3].establece_bonus(200) + "\n");

		for (Empleado e : misEmpleados) {
			e.subeSueldo(5);
		}

		// ordenar los empleados alfabeticamente

		Arrays.sort(misEmpleados);

		for (Empleado e : misEmpleados) {

			System.out.println(
					"Nombre: " + e.dameNombre() + " - Sueldo: " + e.dameSueldo()
							+ " - Fecha de Contrato: " + e.dameFechaContrato());
		}

		/*
		 * for (int i = 0; i < misEmpleados.length; i++) {
		 * misEmpleados[i].subeSueldo(5); }
		 * 
		 * for (int i = 0; i < misEmpleados.length; i++) {
		 * System.out.println("Nombre: " + misEmpleados[i].dameNombre() +
		 * " - Sueldo: " + misEmpleados[i].dameSueldo() +
		 * " - Fecha de Contrato: " + misEmpleados[i].dameFechaContrato()); }
		 */

	}

}
