package U1;
/**
 * Created by ADM-PC on 22/08/2017.
 */
import javax.swing.*;
import java.awt.*;

public class Swing1 {
    public static void main(String [] args){
        JFrame Marco=new JFrame("ITC");
        JLabel Etiqueta = new JLabel("Hola Mundo, hecho con swing", SwingConstants.CENTER);
        JLabel Etiqueta2 = new JLabel("Esta es otra etiqueta", SwingConstants.LEFT);
        Marco.add(Etiqueta, BorderLayout.CENTER);
        Marco.add(Etiqueta2, BorderLayout.NORTH);
        Marco.setSize(700,400);
        Marco.setVisible(true);
        Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
