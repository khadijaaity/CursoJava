package com.cursoJava.cadenas;

import javax.swing.JOptionPane;

public class BucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for (int i = 1; i <= 10; i++) { System.out.println(i + ". marte"); }
		 */
		int arroba = 0;
		boolean punto = false;

		String mail = JOptionPane.showInputDialog("Introducte mail");

		for (int i = 0; i < mail.length(); i++) {
			if (mail.charAt(i) == '@') {
				arroba++;
			}

			if (mail.charAt(i) == '.') {
				punto = true;
			}
		}

		if (arroba == 1 && punto == true) {
			System.out.println("Es correcto");
		} else {
			System.out.println("No es correcto");
		}

	}

}
