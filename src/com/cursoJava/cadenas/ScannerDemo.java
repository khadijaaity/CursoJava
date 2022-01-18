package com.cursoJava.cadenas;

//Programa Java para leer datos de varios tipos usando la clase Scanner
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		// Declarar el objeto e inicializar con
		// el objeto de entrada est�ndar predefinido

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu nombre");
		// entrada de una cadena
		String name = sc.nextLine();

		// entrada de un car�cter
		System.out.println("Genero");
		char gender = sc.next().charAt(0);

		// Entrada de datos num�ricos
		// byte, short y float
		System.out.println("Edad");
		int age = sc.nextInt();
		System.out.println("Telefono");
		long mobileNo = sc.nextLong();
		System.out.println("Promedio");
		double average = sc.nextDouble();

		// Imprima los valores para verificar si la entrada
		// fue obtenida correctamente.

		System.out.println("Nombre: " + name);
		System.out.println("G�nero: " + gender);
		System.out.println("Edad: " + age);
		System.out.println("Tel�fono: " + mobileNo);
		System.out.println("Promedio: " + average);
	}
}
