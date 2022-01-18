package graficos;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EscribiendoEnMarco {

	public static void main(String[] args) {

		MarcoConTexto miMarco = new MarcoConTexto();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTexto extends JFrame {

	public MarcoConTexto() {

//		setVisible(true);
//
//		setSize(600, 450);
//
//		setLocation(400, 200);
//
//		setTitle("primer texto");
//
//		Lamina miLamina = new Lamina();
//
//		add(miLamina);

		setVisible(true);

		Toolkit mipantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = mipantalla.getScreenSize();

		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;

		setSize(anchoPantalla / 2, alturaPantalla / 2);

		setLocation(anchoPantalla / 4, alturaPantalla / 4);

		setTitle("Marco Con Texto");

		Lamina miLamina = new Lamina();

		add(miLamina);

	}
}

class Lamina extends JPanel {

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.drawString("Estamos aprendiendo Swing", 80, 100);

	}
}
