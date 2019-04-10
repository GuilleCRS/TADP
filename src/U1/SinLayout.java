package U1;


import javax.swing.*;

/**
 * Created by ADM-PC on 29/08/2017.
 */
public class SinLayout extends JFrame {
    public SinLayout(){
        setLayout(null);
        JLabel e1 = new JLabel("Peligro=>");
        e1.setBounds(20,15,70,20);
        add(e1);
        JLabel e2 = new JLabel("Adelante=>");
        e2.setBounds(20,70,70,20);
        add(e2);
        JButton boton = new JButton("No pulse");
        boton.setBounds(95,10,100,30);
        add(boton);
        JButton aceptar = new JButton("Pulse");
        aceptar.setBounds(95,65,100,30);
        add(aceptar);
        setSize(350,500);
        setVisible(true);

    }
    public static void main(String []Args){
        SinLayout SL=new SinLayout();

        SL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
