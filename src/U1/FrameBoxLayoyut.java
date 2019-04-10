package U1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ADM-PC on 28/08/2017.
 */
public class FrameBoxLayoyut extends JFrame {
    public FrameBoxLayoyut(){
        super("JDK");
        //EL MARCO POR DEFAULT TIENE BORDEER LAYOUT
        setSize(500,150);
        setLocation(100,300);
        JPanel Panel1=new JPanel(); Panel1.setLayout(new BoxLayout(Panel1,BoxLayout.Y_AXIS));
        JPanel Panel2=new JPanel(); Panel2.setLayout(new BoxLayout(Panel2,BoxLayout.X_AXIS));
        Panel1.add(new JButton("Aceptar"));
        Panel1.add(new JButton("Cancelar"));
        Panel1.add(new JButton("Salir"));
        add(Panel1, BorderLayout.EAST);
        Panel2.add(new JLabel("Nombre"));Panel2.add(new JTextField(10));
        Panel2.add(new JLabel("Edad"));Panel2.add(new JTextField(2));
        add(Panel2,BorderLayout.NORTH);
        JPanel Panel3=new JPanel(); Panel3.setLayout(new BoxLayout(Panel3,BoxLayout.Y_AXIS));
        JRadioButton Radio1=new JRadioButton("Masculino");JRadioButton Radio2=new JRadioButton("Femenino");
        Panel3.add(new JLabel("Seleccione Sexo"));Panel3.add(Radio1);Panel3.add(Radio2);
        add(Panel3,BorderLayout.WEST);
        setVisible(true);
    }
    public static void main(String []Args){
        FrameBoxLayoyut FBL=new FrameBoxLayoyut();

        FBL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
