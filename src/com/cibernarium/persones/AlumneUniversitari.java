package com.cibernarium.persones;

public class AlumneUniversitari extends Alumne {

	private String universitat;

	public AlumneUniversitari() {
		// TODO Auto-generated constructor stub
	}

	public AlumneUniversitari(double pes, double altura) {
		super(pes, altura);
		// TODO Auto-generated constructor stub
	}

	public AlumneUniversitari(String nom, double pes, double altura,
			String sexe, String universitat) {
		super(nom, pes, altura, sexe);
		// TODO Auto-generated constructor stub
		this.universitat = universitat;

	}

	// Getters & Setters
	public String getUniversitat() {
		return universitat;
	}

	public void setUniversitat(String universitat) {
		this.universitat = universitat;
	}

}
