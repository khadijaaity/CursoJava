package com.cursoJava.cadenas;

import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreUsuario = JOptionPane
				.showInputDialog("Introduce tu nombre, por favor");

		// System.out.println(nombreUsuario);

		String edad = JOptionPane
				.showInputDialog("Introduce tu edad, por favor");
		int edad_usuario = Integer.parseInt(edad);

		edad_usuario++;

		System.out.println("Hola " + nombreUsuario
				+ ". El año que viene tendrás " + edad_usuario + " años.");
	}

}
