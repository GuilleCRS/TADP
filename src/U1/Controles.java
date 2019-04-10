package U1;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ADM-PC on 04/09/2017.
 */
public class Controles extends JFrame implements ActionListener {
    private int w=800,h=600;
    private JButton jbtnSalir,acercar,alejar;
    public Controles() throws HeadlessException{
        super();
        setSize(new Dimension(800,600));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mi Paint");
        InitComponents();
        setVisible(true);
    }
    private void InitComponents(){
        JPanel jpNorte = new JPanel();
        jpNorte.setLayout(new BoxLayout(jpNorte,BoxLayout.Y_AXIS));
        jpNorte.setBackground(Color.GRAY);
        JLabel jlEscuela = new JLabel("Instituto tecnologico de culiacan");
        jlEscuela.setAlignmentX(CENTER_ALIGNMENT);
        jlEscuela.setForeground(Color.RED);
        jlEscuela.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        jpNorte.add(jlEscuela);
        JLabel jl1 = new JLabel("Topicos avanzados de programacion");
        jl1.setForeground(Color.green);
        jl1.setFont(new Font("Georgia",Font.ITALIC,15));
        jl1.setAlignmentX(CENTER_ALIGNMENT);
        jpNorte.add(jl1);
        JLabel jl2 = new JLabel("Porgrama ejemplo de controles");
        jl2.setFont(new Font("Wingdins",Font.ITALIC,15));
        jl2.setAlignmentX(CENTER_ALIGNMENT);
        jpNorte.add(jl2);
        add(jpNorte,BorderLayout.NORTH);
        //CENTRO
        JPanel jpCentro = new JPanel(new FlowLayout(FlowLayout.CENTER));
        add(jpCentro,BorderLayout.CENTER);
        JPanel jpSur = new JPanel(new FlowLayout(FlowLayout.CENTER));
        add(jpSur,BorderLayout.SOUTH);
        JPanel jpEste = new JPanel(new FlowLayout(FlowLayout.CENTER));
        add(jpEste,BorderLayout.EAST);
        JPanel jpOeste = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jbtnSalir=new JButton("Salir");
        jbtnSalir.addActionListener(this);
        jpOeste.add(jbtnSalir);
        add(jpOeste,BorderLayout.WEST);

    }
    public static void main(String []args){
        Controles cont=new Controles();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jbtnSalir){
            if(JOptionPane.showConfirmDialog(null,"Seguro","Aviso",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                System.exit(0);
            }
        }




    }
}
