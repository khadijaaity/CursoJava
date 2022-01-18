package com.cibernarium.persones;

import java.util.ArrayList;

public class Alumne extends Persona {

	// ArrayList
	ArrayList<String> cursosMatriculats;

	// Array
	private double[] notes = new double[10];

	/**
	 * M�tode que inicialitxa els cursos de l'alumne
	 */

	public void inicialitzarCursos() {
		cursosMatriculats.add("Hist�ria");
		cursosMatriculats.add("Catal�");
		cursosMatriculats.add("Castell�");
		cursosMatriculats.add("F�sica");
		cursosMatriculats.add("Qu�mica");

	}

	/**
	 * M�tode que guarda la nota a una posici� donada
	 * 
	 * @param nota      Nota a guardar
	 * @param indexCurs �ndex del curs a l'array
	 */

	public void posarNota(double nota, int indexCurs) {
		notes[indexCurs] = nota;
	}

	public Alumne() {
		// TODO Auto-generated constructor stub
	}

	public Alumne(double pes, double altura) {
		super(pes, altura);
	}

	public Alumne(String nom, double pes, double altura, String sexe) {
		super(nom, pes, altura, sexe);
	}

	public void estudiar() {
		System.out.println("L'alumnes estudia");
	}

}
