package com.cibernarium.persones;

import java.util.ArrayList;

public class Alumne extends Persona {

	// ArrayList
	ArrayList<String> cursosMatriculats;

	// Array
	private double[] notes = new double[10];

	/**
	 * Mètode que inicialitxa els cursos de l'alumne
	 */

	public void inicialitzarCursos() {
		cursosMatriculats.add("Història");
		cursosMatriculats.add("Català");
		cursosMatriculats.add("Castellà");
		cursosMatriculats.add("Física");
		cursosMatriculats.add("Química");

	}

	/**
	 * Mètode que guarda la nota a una posició donada
	 * 
	 * @param nota      Nota a guardar
	 * @param indexCurs ïndex del curs a l'array
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
