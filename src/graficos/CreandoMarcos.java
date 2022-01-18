package graficos;

import javax.swing.JFrame;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiMarco marco1 = new MiMarco();

		marco1.setVisible(true);

		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MiMarco extends JFrame {
	public MiMarco() {

		// setSize(500, 300);
		// setLocation(500, 250);

		setBounds(500, 250, 500, 300);

		// redimensionarse
		setResizable(true);

		// pantalla completa
		// setExtendedState(Frame.MAXIMIZED_BOTH);

		setTitle("Mi ventana");

	}
}