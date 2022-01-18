package com.cibernarium.persones;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");

		Persona p = new Persona(83, 186);

		p.setNom("Fran");

		System.out.println("IMC del " + p.getNom() + " : " + p.calcularIMC());

		Alumne josep = new Alumne("Josep", 80, 180, "mascul�");
		Alumne manel = new Alumne("anel", 70, 170, "mascul�");
		Alumne silvia = new Alumne("S�lvia", 50, 160, "femen�");
		Alumne maria = new Alumne("Maria", 60, 1580, "femen�");

		Alumne[] alumnes = new Alumne[5];

		alumnes[0] = josep;
		alumnes[1] = new Alumne("Paula", 60, 165, "femen�");
		alumnes[2] = silvia;
		alumnes[3] = maria;

		Alumne[] alumnesUni = { josep, manel, silvia };

		Alumne estudiant = new Alumne("Gerard", 78, 176, "mascul�");

		System.out.println("IMC del " + estudiant.getNom() + " : "
				+ estudiant.calcularIMC());

		AlumneUniversitari universitat = new AlumneUniversitari("Maria", 50,
				155, "femen�", "UAB");
		universitat.estudiar();

		// recorrer l'array alumnes
		System.out.println("Alumnes");

		for (int i = 0; i < alumnes.length; i++) {
			try {
				System.out.println("Alumne nom: " + alumnes[i].getNom()
						+ " - pes: " + alumnes[i].getPes() + " - Altura: "
						+ alumnes[i].getAltura() + " - Sexe: "
						+ alumnes[i].getSexe());

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

		// recorrer l'array alumnesUni
		System.out.println("Alumnes UNI");

		for (int i = 0; i < alumnesUni.length; i++) {
			try {
				System.out.println("Alumne nom: " + alumnes[i].getNom()
						+ " - pes: " + alumnes[i].getPes() + " - Altura: "
						+ alumnes[i].getAltura() + " - Sexe: "
						+ alumnes[i].getSexe());

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

	}

}
