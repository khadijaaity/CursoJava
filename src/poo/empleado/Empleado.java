package poo.empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona {

	private double sueldo;
	private Date altaContrato;

	private int id;
	private static int idSiguiente = 1;

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		super(nom);

		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1,
				dia);

		altaContrato = calendario.getTime();

		id = idSiguiente;

		idSiguiente++;
	}

	public double dameSueldo() {// GETTER sueldo
		return sueldo;
	}

	public Date dameFechaContrato() {// GETTER fecha
		return altaContrato;
	}

	public void subeSueldo(double porcentaje) { // SETTER
		double aumneto = sueldo * porcentaje / 100;
		sueldo += aumneto;
	}

	@Override
	public String dameDescription() {
		return "Este empleado tiene un Id = " + id + " con un sueldo = "
				+ sueldo;
	}

}
