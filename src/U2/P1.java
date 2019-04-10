package U2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ADM-PC on 27/09/2017.
 */
public class P1 {
    public static void main(String []args){
        JFrame J=new JFrame();
        J.setVisible(true);
        JEnteroField jf=new JEnteroField(10);
        J.add(jf, BorderLayout.NORTH);
    }
}
