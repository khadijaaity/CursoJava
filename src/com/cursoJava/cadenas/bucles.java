package com.cursoJava.cadenas;

import javax.swing.JOptionPane;

public class bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "MAPA";
		String pass = "";

		while (clave.equals(pass) == false) {
			pass = JOptionPane
					.showInputDialog("introduce la contrase�a, por favor");
			if (clave.equals(pass) == false) {
				System.out.println("Contase�a incorrecta");
			}
		}

		System.out.println("Contrase�a correcta. Acceso permitido");
	}

}
