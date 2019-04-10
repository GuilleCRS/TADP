package U1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ADM-PC on 29/08/2017.
 */
public class FrameBoxLayoutBox extends JFrame {
    public FrameBoxLayoutBox(){
        super("BOX LAYOUT");
        setSize(800,500);
        setLocation(100,300);
        Box H = Box.createHorizontalBox();
        Box V = Box.createVerticalBox();
        JLabel Etiqueta1 = new JLabel ("No, Control",SwingConstants.RIGHT);
        H.add(Etiqueta1);
        H.add(Box.createHorizontalStrut(10));
        JTextField NoControl=new JTextField(10);
        H.add(NoControl);
        JLabel Etiqueta2 = new JLabel ("Nombre",SwingConstants.RIGHT);
        H.add(Box.createHorizontalStrut(10));
        H.add(Etiqueta2);
        JTextField Nombre=new JTextField(10);
        H.add(Box.createHorizontalStrut(10));
        H.add(Nombre);
        JButton Grabar=new JButton("Grabar");
        V.add(Grabar);
        V.add(Box.createVerticalStrut(10));
        JButton Cancelar = new JButton("Cancelar");
        V.add(Cancelar);
        V.add(Box.createVerticalStrut(10));
        V.add(new JButton("Limpiar"));
        V.add(Box.createVerticalStrut(10));
        add(H, BorderLayout.NORTH);
        add(V, BorderLayout.EAST);
        setVisible(true);
    }
    public static void main(String []Args){
        FrameBoxLayoutBox FBLB=new FrameBoxLayoutBox();

        FBLB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
