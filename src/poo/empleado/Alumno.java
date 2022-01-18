package poo.empleado;

public class Alumno extends Persona {

	public Alumno(String nom, String car) {
		super(nom);
		carrera = car;

	}

	private String carrera;

	@Override
	public String dameDescription() {
		return "Este alumno est� esudiando la carreara de " + carrera;
	}
}
