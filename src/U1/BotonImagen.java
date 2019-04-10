package U1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ADM-PC on 29/08/2017.
 */
public class BotonImagen extends JFrame {
    Icon Imagen;
    public BotonImagen(){
        JRadioButton r1=new JRadioButton("t1");
        JRadioButton r2=new JRadioButton("t2");
        JRadioButton r3=new JRadioButton("t3");
        Checkbox c1=new Checkbox("ch1");
        Checkbox c2=new Checkbox("ch1");
        Checkbox c3=new Checkbox("ch1");
        setLayout(new FlowLayout());
        //En el frame cambia el simbolo de java por la nueva imagen
        setIconImage(new ImageIcon("c.png").getImage());
        //Recupera la imagen para asignar al boton
        Icon Imagen = new ImageIcon("c.png");
        JButton boton = new JButton("Osito",Imagen);
        boton.setPreferredSize(new Dimension(90,70));
        add(boton);
        add(r1);
        add(r2);
        add(r3);
        add(c1);
        add(c2);
        add(c3);
        setSize(300,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String []Args){
        new BotonImagen();
    }
}
