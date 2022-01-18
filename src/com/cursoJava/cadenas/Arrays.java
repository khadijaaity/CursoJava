package com.cursoJava.cadenas;

import javax.swing.JOptionPane;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int[] mi_matriz = new int[5];
		 * 
		 * mi_matriz[0] = 5; mi_matriz[1] = 53; mi_matriz[2] = 25; mi_matriz[3]
		 * = 52; mi_matriz[4] = 55;
		 * 
		 * 
		 * int[] mi_matriz = { 5, 38, -15, 92, 71 };
		 * 
		 * for (int i = 0; i < mi_matriz.length; i++) { System.out.println((i +
		 * 1) + ". " + mi_matriz[i]); }
		 */

		String[] paises = new String[8];

		for (int i = 0; i < 8; i++) {
			paises[i] = JOptionPane
					.showInputDialog("Introduce paíd " + (i + 1));
		}

		// String[] paises = { "España", "México", "Colombia", "Perú",
		// "Chile","Argentina", "Ecuador", "Venezuela" };

		/*
		 * for (int i = 0; i < paises.length; i++) { System.out.println("País "
		 * + (i + 1) + ": " + paises[i]); }
		 * 
		 */
		int i = 0;
		for (String elemento : paises) {
			i++;
			System.out.println("País " + (i) + ": " + elemento);

		}
	}

}
