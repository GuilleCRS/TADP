package JuegoCarros;
import javax.swing.JFrame;
public class CarrosPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
	public CarrosPrincipal(){
		super("Juego Carros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Dibujar());		
		setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new CarrosPrincipal();	
	}
}
