package com.cursoJava.cadenas;

import javax.swing.JOptionPane;

public class EntradaNumeros {

	public static void main(String[] args) {

		/*
		 * double x = 10000.0; System.out.printf("%1.2f", x / 3);
		 */
		String num1 = JOptionPane.showInputDialog("Introduce un n�mero");

		double num2 = Double.parseDouble(num1);

		System.out.print("La ra�z de " + num2 + " es ");

		System.out.printf("%1.4f", Math.sqrt(num2));

	}

}
