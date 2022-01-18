package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class EventosVentana {

	public static void main(String[] args) {

		MarcoVentana miMarco = new MarcoVentana();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MarcoVentana miMarco2 = new MarcoVentana();
		miMarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		miMarco.setTitle("Ventana 1");
		miMarco2.setTitle("Ventana 2");

		miMarco.setBounds(300, 250, 500, 300);
		miMarco2.setBounds(800, 250, 500, 300);
	}

}

class MarcoVentana extends JFrame {

	public MarcoVentana() {

		setVisible(true);

		// Ventana miVentana = new Ventana();

		// addWindowListener(miVentana);

		addWindowListener(new Ventana());

	}
}

class Ventana extends WindowAdapter {

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}

}

//
//class Ventana implements WindowListener {
//
//	@Override
//	public void windowActivated(WindowEvent e) {
//		System.out.println("Ventana Activada");
//	}
//
//	@Override
//	public void windowClosed(WindowEvent e) {
//		System.out.println("La ventana ha sido cerrada");
//	}
//
//	@Override
//	public void windowClosing(WindowEvent e) {
//		System.out.println("Cerrando Ventana");
//	}
//
//	@Override
//	public void windowDeactivated(WindowEvent e) {
//		System.out.println("Ventana desactivada");
//	}
//
//	@Override
//	public void windowDeiconified(WindowEvent e) {
//		System.out.println("Ventana restaurada");
//	}
//
//	@Override
//	public void windowIconified(WindowEvent e) {
//		System.out.println("Ventana minimizada");
//	}
//
//	@Override
//	public void windowOpened(WindowEvent e) {
//		System.out.println("Ventana Abierta");
//	}
//}
