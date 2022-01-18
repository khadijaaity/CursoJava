package ejercicio1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MarcoDialogos extends JFrame {

	public MarcoDialogos() {

		setTitle("Prueba de diálogos");

		setBounds(350, 150, 600, 500);

		JPanel laminaCuadricula = new JPanel();

		laminaCuadricula.setLayout(new GridLayout(2, 3));

		String[] primero = { "Mensaje", "Confirmar", "Opción", "Entrada" };

		lamina_tipo = new LaminaBotones("Tipo", primero);

		lamina_tipo_mensaje = new LaminaBotones("Tipo de Mensaje",
				new String[] {

						"ERROR_MESSAGE", "INFORMACION_MESSAGE",
						"WARNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"

				});

		lamina_mensaje = new LaminaBotones("Mensaje", new String[] {

				"Cadena", "Icono", "Componente", "Otros", "Object[]"

		});

		lamina_confirmar = new LaminaBotones("Confirmar", new String[] {

				"DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION",
				"OK_CANCEL_OPTION"

		});

		lamina_opcion = new LaminaBotones("Opción", new String[] {

				"String[]", "Icon[]", "Object[]"

		});

		lamina_entrada = new LaminaBotones("Entrada", new String[] {

				"Campo de texto", "Combo"

		});

		laminaCuadricula.add(lamina_tipo);
		laminaCuadricula.add(lamina_tipo_mensaje);
		laminaCuadricula.add(lamina_mensaje);
		laminaCuadricula.add(lamina_confirmar);
		laminaCuadricula.add(lamina_opcion);
		laminaCuadricula.add(lamina_entrada);

		// lamin inf

		JPanel laminaMostrar = new JPanel();

		JButton botonMostrar = new JButton("Mostrar");

		botonMostrar.addActionListener(new AccionMostrar());

		laminaMostrar.add(botonMostrar);

		add(laminaMostrar, BorderLayout.SOUTH);

		add(laminaCuadricula, BorderLayout.CENTER);

//		JPanel miLamina = new LaminaSuperior();
//		add(miLamina);
	}

	// ----------- PROPORCIONA EL MENSAJE-----

	public Object dameMensaje() {

		String s = lamina_mensaje.dameSeleccion();

		if (s.equals("Cadena")) {

			return cadenaMensaje;

		} else if (s.equals("Icono")) {

			return iconoMensaje;

		} else if (s.equals("Componente")) {

			return componenteMensaje;

		} else if (s.equals("Otros")) {

			return objetoMensaje;

		} else if (s.equals("Object[]")) {

			return new Object[] { cadenaMensaje, iconoMensaje,
					componenteMensaje, objetoMensaje };
		} else {
			return null;
		}

	}

	// ----------- DEVUELVE TIPO ICONO ------

	public int dameIcono() {
		String s = lamina_tipo_mensaje.dameSeleccion();

		if (s.equals("ERROR_MESSAGE")) {
			return 0;

		} else if (s.equals("INFORMACION_MESSAGE")) {
			return 1;

		} else if (s.equals("WARNING_MESSAGE")) {
			return 2;

		} else if (s.equals("QUESTION_MESSAGE")) {
			return 3;

		} else if (s.equals("PLAIN_MESSAGE")) {
			return -1;

		} else {
			return 0;
		}
	}

	// ---------- DEVUELVE TIPO boton de confirmar -----------

	public int dameTipoConfirmacion() {

		String s = lamina_confirmar.dameSeleccion();

		if (s.equals("DEFAULT_OPTION")) {
			return -1;

		} else if (s.equals("YES_NO_OPTION")) {
			return 0;

		} else if (s.equals("YES_NO_CANCEL_OPTION")) {
			return 1;

		} else if (s.equals("OK_CANCEL_OPTION")) {
			return 2;

		} else {
			return 0;
		}
	}

	// ---------------DA OPCIONES A LA LÁMINA OPCION -------

	public Object[] dameOpciones(LaminaBotones lamina) {

		String s = lamina.dameSeleccion();

		if (s.equals("String[]")) {

			return new String[] { "Amarillo", "Azul", "Rojo" };

		} else if (s.equals("Icon[]")) {

			return new Object[] { new ImageIcon("src/ejercicio1/bola_azul.jpg"),
					new ImageIcon("src/ejercicio1/bola_azul.jpg"),
					new ImageIcon("src/ejercicio1/bola_azul.jpg") };

		} else if (s.equals("Object[]")) {

			return new Object[] { cadenaMensaje, iconoMensaje,
					componenteMensaje, objetoMensaje };
		} else {
			return null;
		}
	}

	// --------------- CREAR UN COMBO---------

	// ---------------- CLASE INTERNA QUE GESTIONA EVENTOS----

	private class AccionMostrar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			// System.out.println(lamina_tipo.dameSeleccion());

			if (lamina_tipo.dameSeleccion().equals("Mensaje")) {

				JOptionPane.showMessageDialog(MarcoDialogos.this, dameMensaje(),
						"Título", dameIcono());

			}

			else if (lamina_tipo.dameSeleccion().equals("Confirmar")) {
				JOptionPane.showConfirmDialog(MarcoDialogos.this, dameMensaje(),
						"Título", dameTipoConfirmacion(), dameIcono());
			}

			else if (lamina_tipo.dameSeleccion().equals("Opción")) {
				JOptionPane.showOptionDialog(MarcoDialogos.this, dameMensaje(),
						"Título", 1, dameIcono(), null,
						dameOpciones(lamina_opcion), null);
			}

			else if (lamina_tipo.dameSeleccion().equals("Entrada")) {

				if (lamina_entrada.dameSeleccion().equals("Campo de texto")) {
					JOptionPane.showInputDialog(MarcoDialogos.this,
							dameMensaje(), "Título", dameIcono());
				} else {
					JOptionPane.showInputDialog(MarcoDialogos.this,
							dameMensaje(), "Título", dameTipoConfirmacion(),
							null, new String[] { "Amarillo", "Azul", "Rojo" },
							"Azul");
				}

			}

		}

	}

	private LaminaBotones lamina_tipo, lamina_tipo_mensaje, lamina_mensaje,
			lamina_confirmar, lamina_opcion, lamina_entrada;

	private String cadenaMensaje = "Mensaje";

	private Icon iconoMensaje = new ImageIcon("src/ejercicio1/bola_azul.jpg");

	private Object objetoMensaje = new Date();

	private Component componenteMensaje = new Lamina_Ejemplo();

}

class Lamina_Ejemplo extends JPanel {

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(),
				getHeight());

		g2.setPaint(Color.YELLOW);

		g2.fill(rectangulo);

	}
}

//class LaminaSuperior extends JPanel {
//
//	public LaminaSuperior() {
//
//		setLayout(new GridLayout(2, 3));
//
//	}
//}