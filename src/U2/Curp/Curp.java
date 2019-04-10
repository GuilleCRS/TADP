package U2.Curp;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Curp implements ActionListener {
    boolean m=true;
    JPanel Centro;
    JButton ini,borra;
    JCurpField curp;
    public void init(){

        JFrame ps=new JFrame();
        ps.revalidate();
        ps.setVisible(true);
        ps.setTitle("Curp");
        ps.setBackground(new Color(201, 198, 195));
        ps.setSize(500,250);
        ps.setLocationRelativeTo(null);
        ps.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel Sur = new JPanel();
        Centro= new JPanel();
        JPanel Este=new JPanel();
        JPanel Oeste=new JPanel();
        JLabel imagen = new JLabel(new ImageIcon("src//U2//Curp//edomex.jpg"));
        imagen.setPreferredSize(new Dimension(200,200));
        imagen.setBackground(new Color(201, 198, 195));
        Oeste.add(imagen);
        JLabel ima = new JLabel("Introudzca el curp ");
        JLabel curptxt=new JLabel("Curp:");
        curptxt.setForeground(Color.white);
        curp=new JCurpField(18);
        curp.setSize(500,30);
        curp.setMaximumSize(new Dimension(500,30));
        curp.setPreferredSize(new Dimension(500,30));
        curp.setForeground(Color.RED);
        ini = new JButton("Validar");
        borra = new JButton("Borrar ");
        borra.addActionListener(this);
        ini.addActionListener(this);

        Centro.setLayout(new BoxLayout(Centro,BoxLayout.Y_AXIS));
        Centro.add(ima);
        Centro.add(curptxt);
        Centro.add(curp);
        Centro.add(new JLabel(" "));
        Centro.add(ini);
        Centro.add(borra);


        Sur.setBackground(new Color(201, 198, 195));
        Centro.setBackground(new Color(201, 198, 195));
        Este.setBackground(new Color(201, 198, 195));
        Oeste.setBackground(new Color(201, 198, 195));
        ps.add(Centro,BorderLayout.CENTER);
        ps.add(Sur,BorderLayout.SOUTH);
        ps.add(Este,BorderLayout.EAST);
        ps.add(Oeste,BorderLayout.WEST);
        ps.repaint();
        ps.pack();




    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ini) {
        	if(curp.getText()==null) {curp.setText("");}
            if(curp.getText().length()!=18) {
            	JOptionPane.showMessageDialog(Centro, "Curp no valida");
            	return;
            }

            String mes=Character.toString(curp.getText().charAt(6))+Character.toString(curp.getText().charAt(7));
            String dia=Character.toString(curp.getText().charAt(8))+Character.toString(curp.getText().charAt(9));
            int compmes=Integer.parseInt(mes);int compdia=Integer.parseInt(dia);
            
            if(compmes==0||compmes>12){
                m=false;
            }
            if(compdia==0 || compdia>31){

                m=false;
            }

            if(m==false){

                JOptionPane.showMessageDialog(Centro,"Su curp "+curp.getText().toUpperCase()+" no es valida ,comprueba la fecha de nacimiento.");
            }
            if(m==true){
                JOptionPane.showMessageDialog(Centro,"Su curp "+curp.getText().toUpperCase()+" tiene formato valido.");
            }
        }
            
        m=true;
        if(e.getSource()==borra){
            curp.setText("");
        }


    }
    public static void main(String []a){
        Curp n=new Curp();
         n.init();
      
    }
}
