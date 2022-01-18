package com.cursoJava.cadenas;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String saludo = "Hola, Qué tal!!!";

		System.out.println(saludo.charAt(2));

		System.out.println(saludo.substring(6, 10));

		System.out.println(saludo.length());

		int ultima = saludo.length();

		System.out.println(saludo.charAt(ultima - 1));

	}

}
