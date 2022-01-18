package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class CambioEstado {

	public static void main(String[] args) {

		MarcoEstado miMarco = new MarcoEstado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		miMarco.setTitle("Marco estado");

		miMarco.setBounds(300, 250, 500, 300);
	}

}

class MarcoEstado extends JFrame {

	public MarcoEstado() {

		setVisible(true);

		CambiaEstado nuevoEstado = new CambiaEstado();

		addWindowStateListener(nuevoEstado);

	}
}

class CambiaEstado implements WindowStateListener {

	@Override
	public void windowStateChanged(WindowEvent e) {

		System.out.println("La ventana ha cambiado de estado");

	}

}