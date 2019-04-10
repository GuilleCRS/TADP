package U1;

/**
 * Created by ADM-PC on 25/08/2017.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TamBoton extends JFrame{
    int r=20,g=40,b=50;

    public TamBoton(){
        add(new JLabel("Este boton aumenta 50 pixeles por dimension"));
        setLayout(new FlowLayout());
        JButton boton = new JButton("Boton");
        //boton.setSize(150,100);
        boton.setPreferredSize(new Dimension(50,50));
        boton.addActionListener(e -> {
            JButton boton1 = (JButton) e.getSource();
            boton1.setBackground(new Color(r, g, b));
            boton1.setSize(boton1.getWidth() + 20, boton1.getHeight() + 20);
            r = r + 1;
            g = g + 10;
            b = b + 1;
            repaint();
        });
        add(boton);
        setSize(750,500);
        setVisible(true);
    }
    public static void main(String []Args){
        TamBoton demo= new TamBoton();
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
