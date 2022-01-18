package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		MarcoCentrado miMarco = new MarcoCentrado();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		miMarco.setVisible(true);

	}

}

class MarcoCentrado extends JFrame {
	public MarcoCentrado() {

		Toolkit mipantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = mipantalla.getScreenSize();

		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;

		setSize(anchoPantalla / 2, alturaPantalla / 2);

		setLocation(anchoPantalla / 4, alturaPantalla / 4);

		setTitle("Marco Centrado");

		Image miIcono = mipantalla.getImage("icono.png");

		setIconImage(miIcono);
	}
}