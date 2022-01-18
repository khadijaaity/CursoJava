package pruebas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {
	public static void main(String[] args) {

		// DameLaHora oyente = new DameLaHora();

		ActionListener oyente = new DameLaHora();

		Timer temporizador = new Timer(5000, oyente);

		temporizador.start();

		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");

		System.exit(0);
	}
}

class DameLaHora implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		Date hora = new Date();

		System.out.println("La hora cada 5s: " + hora);

		Toolkit.getDefaultToolkit().beep();

	}

}