package U1;


import javax.swing.*;
import java.awt.*;

/**
 * Created by ADM-PC on 24/08/2017.
 */
public class BorderLO {
    public static void main(String []Args){
        JFrame Marco= new JFrame("ITC");
        Marco.setLocationRelativeTo(null);
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        JPanel panel4=new JPanel();
        JPanel panel5=new JPanel();
        panel1.setBackground(new Color(8, 15, 200));
        panel2.setBackground(new Color(35, 255, 0));
        panel3.setBackground(new Color(223, 230, 0));
        panel4.setBackground(new Color(245, 0, 9));
        panel5.setBackground(new Color(29, 160, 16));
        //Marco.setIconImage(new ImageIcon("C:\\Users\\ADM-PC\\Desktop\\medium_volume1600"));
        JLabel Etiqueta1 = new JLabel("Norte", SwingConstants.LEFT );
        JLabel Etiqueta2 = new JLabel("Sur", SwingConstants.LEFT );
        JLabel Etiqueta3 = new JLabel("Este", SwingConstants.LEFT );
        JLabel Etiqueta4 = new JLabel("Oeste", SwingConstants.LEFT );
        JLabel Etiqueta5 = new JLabel("Centro", SwingConstants.LEFT );
        panel1.add(Etiqueta1, BorderLayout.CENTER);
        panel2.add(Etiqueta2, BorderLayout.CENTER);
        panel3.add(Etiqueta3, BorderLayout.CENTER);
        panel4.add(Etiqueta4, BorderLayout.CENTER);
        panel5.add(Etiqueta5, BorderLayout.CENTER);
        Marco.add(panel1 , BorderLayout.NORTH);
        Marco.add(panel2 , BorderLayout.SOUTH);
        Marco.add(panel3 , BorderLayout.EAST);
        Marco.add(panel4 , BorderLayout.WEST);
        Marco.add(panel5 , BorderLayout.CENTER);
        Marco.setSize(400,400);
        Marco.setLocationRelativeTo(null);
        Marco.setVisible(true);
        Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
