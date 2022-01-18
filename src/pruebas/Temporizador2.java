package pruebas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Temporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reloj reloj = new Reloj();

		reloj.enMarcha(3000, true);

		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");

		System.exit(0);
	}

}

class Reloj {

	public void enMarcha(int intervalo, final boolean sonido) {

		class DameLaHora2 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent evento) {

				Date hora = new Date();

				System.out.println("La hora cada 3s: " + hora);

				if (sonido) {
					Toolkit.getDefaultToolkit().beep();
				}

			}
		}

		ActionListener oyente = new DameLaHora2();

		Timer temporizador = new Timer(intervalo, oyente);

		temporizador.start();

	}

	/*
	 * public Reloj(int intervalo, boolean sonido) {
	 * 
	 * this.intervalo = intervalo;
	 * 
	 * this.sonido = sonido;
	 * 
	 * }
	 */

	// private int intervalo;

	// private boolean sonido;

}
