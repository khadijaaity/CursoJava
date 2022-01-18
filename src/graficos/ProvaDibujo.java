package graficos;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProvaDibujo {

	public static void main(String[] args) {

		MarcoConDibujos miMarco = new MarcoConDibujos();

		miMarco.setVisible(true);

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConDibujos extends JFrame {

	public MarcoConDibujos() {

		setTitle("Prueva de dibujo");

		setSize(600, 450);
		setLocation(400, 200);

		LaminaConFiguras miLamina = new LaminaConFiguras();

		add(miLamina);
	}
}

class LaminaConFiguras extends JPanel {

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

//		g.drawRect(50, 50, 200, 200);
//		g.drawLine(50, 50, 250, 250);
//		g.drawLine(50, 250, 250, 50);
//		g.drawArc(50, 100, 100, 200, 120, 150);

	}
}
