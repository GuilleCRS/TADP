package U1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ADM-PC on 28/08/2017.
 */
public class FrameFlowLayout extends JFrame {
    public FrameFlowLayout(){
        super("Banco");
        JTextField Nombre=new JTextField(20);
        setLayout(new GridLayout(5,4,7,12));
        setSize(500,350);
        setLocation(100,300);
        JLabel Etiqueta1 = new JLabel("Cuenta       ",SwingConstants.CENTER);
        add(Etiqueta1);
        JLabel Etiqueta2=new JLabel("Nombre",SwingConstants.CENTER);
        add(Etiqueta2);
        add(new JButton("Saldo"));
        add(new JButton("Depositar"));
        add(new JButton("Retirar"));
        add(Nombre);
        setVisible(true);

    }
    public static void main(String []Args){
        FrameFlowLayout FFL=new FrameFlowLayout();

        FFL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
