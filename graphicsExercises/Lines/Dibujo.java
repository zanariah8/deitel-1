/* Figuras 4.21 y 4.22 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dibujo {
	
	public static void main (String args[]) {
		JFrame ventana = new JFrame ();
		PanelDibujo pd;

		pd = new PanelDibujo (JOptionPane.showInputDialog ("Ingrese una opción:\n1. Triángulo de líneas en una esquina\n2. Triángulos de líneas en todas las esquinas\n3. Una curva de líneas\n4. 4 Curvas de líneas").charAt (0));

		ventana.add (pd);

		ventana.setSize (260, 260);
		ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		ventana.setVisible (true);
	}
}
