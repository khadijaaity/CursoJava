package pruebas;

import java.util.Scanner;

public class Uso_tallas {

	// enum Talla { MINI, MEDIANA, GRANDE, MUY_GRANDE};

	enum Talla {

		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}

		private String abreviatura;

		// Metodos GETTERS Y SETTERS

		public String dameAbreviatura() {
			return abreviatura;
		}
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(
				"Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");

		String entrada_datos = entrada.next().toUpperCase();

		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);

		System.out.println("Talla " + la_talla);
		System.out.println("Abreviatura = " + la_talla.dameAbreviatura());
	}
}
