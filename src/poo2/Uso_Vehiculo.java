package poo2;

public class Uso_Vehiculo {

	public static void main(String[] args) {

		Coche miCoche1 = new Coche();

		miCoche1.establece_color("rojo");

		Furgoneta miFurgoneta1 = new Furgoneta(7, 580);

		miFurgoneta1.establece_color("azul");

		miFurgoneta1.configura_asientos("si");

		miFurgoneta1.configura_climatizador("No");

		System.out.println(
				miCoche1.dime_datos_generales() + "\n" + miCoche1.dime_color());

		System.out.println(miFurgoneta1.dameDatosFurgoneta());

		System.out.println(miFurgoneta1.dime_datos_generales());

		/*
		 * Coche miCoche = new Coche(); // instanciar una clase. Ejemplar de
		 * clase
		 * 
		 * System.out.println(miCoche.dime_datos_generales());
		 * 
		 * miCoche.establece_color(JOptionPane.showInputDialog("Introduce color"
		 * ));
		 * 
		 * System.out.println(miCoche.dime_color());
		 * 
		 * miCoche.configura_asientos(
		 * JOptionPane.showInputDialog("¿Tiene asientos de cuero si/no?"));
		 * System.out.println(miCoche.dime_asientos());
		 * 
		 * miCoche.configura_climatizador(
		 * JOptionPane.showInputDialog("¿Tiene climatizador si/no?"));
		 * System.out.println(miCoche.dime_climatizador());
		 * 
		 * System.out.println(miCoche.dime_peso_coche());
		 * 
		 * System.out.println( "El precio final de coche es " +
		 * miCoche.precio_coche());
		 */
	}

}
