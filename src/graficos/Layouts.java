package graficos;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts {

	public static void main(String[] args) {

		MarcoLayout marco = new MarcoLayout();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco.setVisible(true);
	}

}

class MarcoLayout extends JFrame {

	public MarcoLayout() {

		setTitle("Prueba Acciones");

		setBounds(600, 300, 600, 300);

		PanelLayout lamina = new PanelLayout();

		// FlowLayout disposicion = new FlowLayout((FlowLayout.LEFT));

		// lamina.setLayout(disposicion);

		lamina.setLayout(new FlowLayout(FlowLayout.LEFT));

		add(lamina);
	}
}

class PanelLayout extends JPanel {

	public PanelLayout() {
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));
		add(new JButton("Azul"));

	}
}