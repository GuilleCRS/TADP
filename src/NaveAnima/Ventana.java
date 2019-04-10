package NaveAnima;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public Ventana(){
		super("Juego Carros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Dibujar());		
		setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		
	}

	public static void main(String[] args) {
		new Ventana();
		
	}

}
