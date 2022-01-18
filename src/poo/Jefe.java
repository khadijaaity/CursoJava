package poo;

public class Jefe extends Empleado implements Jefes {

	private double incentivo;

	public Jefe(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);

	}

	public void estableceIncentivo(double b) {
		incentivo = b;
	}

	@Override
	public double dameSueldo() {

		double sueldoJefe = super.dameSueldo();

		return sueldoJefe + incentivo;
	}

	@Override
	public String tomarDecisiones(String decision) {
		return "Un miembre de la dirección la tomado la decisión de: "
				+ decision;
	}

	@Override
	public double establece_bonus(double gratificacion) {

		double prima = 2000;

		return Trabajadores.bonus_base + gratificacion + prima;

	}

}
