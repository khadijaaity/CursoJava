package com.cibernarium.persones;

import java.util.Calendar;

public class Persona {
	private String nom;
	private String cognom1;
	private String cognom2;
	private Calendar DataNaixement;
	private double pes;
	private double altura;
	private String sexe;

	public Persona() {
		System.out.println("S'ha creat una persona sense valors als atributs");
	}

	public Persona(double pes, double altura) {
		this.pes = pes;
		this.altura = altura;
	}

	public Persona(String nom, double pes, double altura, String sexe) {
		this.pes = pes;
		this.altura = altura;
		this.nom = nom;
		this.sexe = sexe;
	}

	/**
	 * Mètode que calcula l'índex de massa corporal d'una persona
	 * 
	 * @return Índex de massa corporal.
	 */

	public double calcularIMC() {
		return this.pes / (this.altura * this.altura);
	}

	// Getters & Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
		System.out.println("S'ha modificat el nom de l'objecte");
	}

	public String getCognom1() {
		return cognom1;
	}

	public void setCognom1(String cognom1) {
		this.cognom1 = cognom1;
	}

	public String getCognom2() {
		return cognom2;
	}

	public void setCognom2(String cognom2) {
		this.cognom2 = cognom2;
	}

	public Calendar getDataNaixement() {
		return DataNaixement;
	}

	public void setDataNaixement(Calendar dataNaixement) {
		DataNaixement = dataNaixement;
	}

	public double getPes() {
		return pes;
	}

	public void setPes(double pes) {
		this.pes = pes;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

}
