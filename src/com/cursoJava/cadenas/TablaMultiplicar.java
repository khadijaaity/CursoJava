package com.cursoJava.cadenas;

public class TablaMultiplicar {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		taulaMultiplicar(8, 10);
		taulaMultiplicarWhile(7, 50);
		taulaMultiplicarDoWhile(3, 20);

		int[] numeros = { 2, 3, 67, 233, 12, 2, 56, 24 };
		int numeroAbuscar = 2;

		boolean trobat = buscarNumero(numeros, numeroAbuscar);

		if (trobat) {
			System.out.println("s'ha trobat el número " + numeroAbuscar);
		} else {
			System.out.println("No s'ha trobat el número " + numeroAbuscar);
		}
	}

	private static void taulaMultiplicar(int numero, int rang) {
		// TODO Auto-generated method stub
		System.out.println("TAULA DE MULTIPLICAR AMB FOR");
		for (int i = 1; i <= rang; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);

		}

	}

	private static void taulaMultiplicarWhile(int numero, int rang) {
		// TODO Auto-generated method stub
		System.out.println("TAULA DE MULTIPLICAR AMB WHILE");
		int i = 1;
		while (i <= rang) {
			System.out.println(numero + " x " + i + " = " + numero * i);
			i++;
		}

	}

	private static void taulaMultiplicarDoWhile(int numero, int rang) {
		// TODO Auto-generated method stub
		System.out.println("TAULA DE MULTIPLICAR AMB DO WHILE");
		int i = 1;

		do {
			System.out.println(numero + " x " + i + " = " + numero * i);
			i++;

		} while (i <= rang);

	}

	private static boolean buscarNumero(int[] numeros, int numeroAbuscar) {
		// TODO Auto-generated method stub
		boolean trobat = false;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numeroAbuscar) {
				trobat = true;
				break;
			}
		}
		return trobat;
	}

}
