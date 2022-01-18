package com.cursoJava.cadenas;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] matriz_aleatoria = new int[150];
		 * 
		 * for (int i = 0; i < matriz_aleatoria.length; i++) {
		 * matriz_aleatoria[i] = (int) Math.round(Math.random() * 100); }
		 * 
		 * int i = 0;
		 * 
		 * for (int numeros : matriz_aleatoria) { i++; System.out.print(i + ". "
		 * + numeros + " - "); }
		 */

		/*
		 * int[][] matrix = new int[4][5];
		 * 
		 * matrix[0][0] = 14; matrix[0][1] = 44; matrix[0][2] = 60; matrix[0][3]
		 * = 17; matrix[0][4] = 7;
		 * 
		 * matrix[1][0] = 15; matrix[1][1] = 21; matrix[1][2] = 18; matrix[1][3]
		 * = 1; matrix[1][4] = 24;
		 * 
		 * matrix[2][0] = 2; matrix[2][1] = 15; matrix[2][2] = 25; matrix[2][3]
		 * = 18; matrix[2][4] = 17;
		 * 
		 * matrix[3][0] = 13; matrix[3][1] = 78; matrix[3][2] = 5; matrix[3][3]
		 * = 10; matrix[3][4] = 18;
		 */

		int[][] matrix = { { 10, 15, 18, 19, 21 }, { 5, 25, 37, 41, 15 },
				{ 7, 19, 32, 14, 90 }, { 50, 7, 52, 30, 5 } };
		/*
		 * for (int i = 0; i < 4; i++) { System.out.println(); for (int j = 0; j
		 * < 5; j++) { System.out.print(matrix[i][j] + " "); } }
		 */

		for (int[] fila : matrix) {
			System.out.println();
			for (int z : fila) {
				System.out.print(z + " ");
			}
		}

	}

}
