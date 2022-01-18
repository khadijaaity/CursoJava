package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Comparable, Trabajadores {

	private String nombre;

	private double sueldo;

	private Date altaContrato;

	private int id;

	private static int idSiguiente = 1;

	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;

		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1,
				dia);

		altaContrato = calendario.getTime();

		id = idSiguiente;

		idSiguiente++;
	}

	public Empleado(String nom) { // constructor
		this(nom, 30000, 200, 01, 01);

	}

	public String dameNombre() {// GETTER nombre
		return nombre + " - Id: " + id + " ";
	}

	public void configuraNombre() {// SETTER nombre
		nombre = "Pepe";
	}

	public double dameSueldo() {// GETTER sueldo
		return sueldo;
	}

	public Date dameFechaContrato() {// GETTER fecha
		return altaContrato;
	}

	public void subeSueldo(double porcentaje) { // SETTER
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	@Override
	public int compareTo(Object miObjeto) {

		Empleado otroEmpleado = (Empleado) miObjeto;

		if (dameSueldo() < otroEmpleado.dameSueldo()) {
			return -1;
		}

		if (this.dameSueldo() > otroEmpleado.dameSueldo()) {
			return 1;
		}
		return 0;
	}

	@Override
	public double establece_bonus(double gratificacion) {

		return Trabajadores.bonus_base + gratificacion;

	}

}
