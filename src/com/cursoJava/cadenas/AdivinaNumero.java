package com.cursoJava.cadenas;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio = (int) (Math.random() * 100);
		// System.out.println(aleatorio);

		Scanner entrada = new Scanner(System.in);

		int numero = 0;

		int intentos = 0;

		do {
			intentos++;
			System.out.println("Introduce un n?mero, por favor");

			numero = entrada.nextInt();

			if (aleatorio < numero) {
				System.out.println("M?s bajo");
			} else if (aleatorio > numero) {
				System.out.println("m?s alto");
			}
		} while (numero != aleatorio);

		System.out.println(
				"Correcto. Lo has conseguido en " + intentos + " intentos");

	}

}
