package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {

	public static void main(String[] args) {

		MarcoBotones miMarco = new MarcoBotones();

		miMarco.setVisible(true);

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame {

	public MarcoBotones() {

		setTitle("Botones y Eventos");

		setBounds(500, 250, 500, 300);

		LaminaBotones miLamina = new LaminaBotones();

		add(miLamina);

	}
}

class LaminaBotones extends JPanel {

	JButton botonAzul = new JButton("Blue");
	JButton botonAmarillo = new JButton("Yellow");
	JButton botonRojo = new JButton("Red");

	public LaminaBotones() {

		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);

		ColorFondo azul = new ColorFondo(Color.blue);
		ColorFondo amarillo = new ColorFondo(Color.yellow);
		ColorFondo rojo = new ColorFondo(Color.red);

		botonAzul.addActionListener(azul);
		botonAmarillo.addActionListener(amarillo);
		botonRojo.addActionListener(rojo);

//		botonAzul.addActionListener(new ColorFondo(Color.BLUE));
//		botonRojo.addActionListener(new ColorFondo(Color.red));
//		botonAmarillo.addActionListener(new ColorFondo(Color.yellow));

	}

//	Clase interna
	private class ColorFondo implements ActionListener {

		private Color colorDeFondo;

		public ColorFondo(Color c) {

			colorDeFondo = c;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);

		}
	}
}

//class LaminaBotones extends JPanel implements ActionListener {
//
//	JButton botonAzul = new JButton("Black");
//
//	JButton botonAmarillo = new JButton("Amarillo");
//
//	JButton botonRojo = new JButton("Rojo");
//
//	public LaminaBotones() {
//
//		add(botonAzul);
//		add(botonAmarillo);
//		add(botonRojo);
//
//		botonAzul.addActionListener(this);
//		botonAmarillo.addActionListener(this);
//		botonRojo.addActionListener(this);
//
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//
//		Object botonPulsado = e.getSource();
//
//		if (botonPulsado == botonAzul) {
//			setBackground(Color.blue);
//		} else if (botonPulsado == botonAmarillo) {
//			setBackground(Color.yellow);
//		} else {
//			setBackground(Color.red);
//		}
//
//	}
//
//}
