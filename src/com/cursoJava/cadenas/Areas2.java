package com.cursoJava.cadenas;

import java.util.Scanner;

public class Areas2 {

	public static void main(String[] args) {
		System.out.println("Introduce numero de cuadrado para calcular");
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] sides = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Lado del cuadrado " + (i + 1));
			sides[i] = scanner.nextInt();
		}
		// your code goes here
		int i = 1;
		for (int side : sides) {
			side = side * side;
			System.out.println("La área del cuadrado " + i + " es " + side);
			i++;
		}
		/*
		 * for (int i = 0; i < length; i++) { // sides[i] = sides[i]*sides[i];
		 * sides[i] = (int) Math.pow(sides[i], 2); System.out.println(sides[i]);
		 * }
		 */
	}
}
