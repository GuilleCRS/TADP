package U1.MiPaint;



import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Guillermo Cruz on 04/09/2017.
 */
public class Paint extends JFrame implements ActionListener {
    //Lienzo
    JPLienzo jpCentro;
    //colores
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JButton f;
    private JButton g;
    private JButton c1;
    private JButton c2;
    private JButton c3;
    private JButton c4;
    private JButton c5;
    private JLabel jlEscuela,jl1,jl2;
    private int w=800,h=600;
    private JButton jbtnSalir;

    private JMenuItem jminuevo;
    private JMenuItem jmiabrir;
    private JMenuItem jmiguardar;
    private JMenuItem jmisalir;
    //barra de herramientas
    private JToolBar jtbMain;
    private JButton jbtnNuevo,jbtnGuardar,jbtnAbrir;
    //status bar
    private JToolBar jtbStatus;
    private JLabel jlblInfo;
    private JLabel jlblHora;
    private JPanel contorno,relleno;
    private boolean bandrelleno;
    private JMenuItem rellenito;
    private JRadioButton radio;

    public Paint() throws HeadlessException{
        super();
        setSize(new Dimension(800,600));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mi Paint");
        jpCentro = new JPLienzo();

        InitComponents();
        setVisible(true);
    }
    private void InitComponents(){
        Menu();
        BarraHerramientas();
        StatusBar();

        JPanel jpNorte = new JPanel();
        jpNorte.setLayout(new BoxLayout(jpNorte,BoxLayout.Y_AXIS));
        JPanel jpNorteExt = new JPanel();
        jpNorteExt.setLayout(new BorderLayout());
        jpNorteExt.add(jpNorte,BorderLayout.NORTH);
        jpNorteExt.add(jtbMain,BorderLayout.NORTH);
        jpNorte.setBackground(Color.GRAY);
        add(jpNorteExt,BorderLayout.NORTH);
        //CENTRO
        //Sur
        jpCentro = new JPLienzo();
        add(jpCentro, BorderLayout.CENTER);
        JPanel jpSur = new JPanel();
        jpSur.setLayout(new BoxLayout(jpSur,BoxLayout.X_AXIS));
        jpSur.add(jtbStatus,BorderLayout.CENTER);
        add(jpSur,BorderLayout.SOUTH);
        //Este
        JPanel jpEste = new JPanel();
        jpEste.setLayout(new BoxLayout(jpEste,BoxLayout.Y_AXIS));
        jpEste.setBackground(Color.gray);

        a=new JButton(new ImageIcon("src/U1/MiPaint/Images/rgb.png"));
        a.addActionListener(this);
        a.setPreferredSize(new Dimension(30, 30));
        jpEste.add(a);

        c1=new JButton(new ImageIcon("src/U1/MiPaint/Images/square-shape-shadow.png"));
        c1.addActionListener(this);
        c1.setPreferredSize(new Dimension(30,30));
        c1.setBackground(Color.RED);
        jpEste.add(c1);

        c2=new JButton(new ImageIcon("src/U1/MiPaint/Images/square-shape-shadow (1).png"));
        c2.addActionListener(this);
        c2.setPreferredSize(new Dimension(30,30));
        c2.setBackground(Color.BLUE);
        jpEste.add(c2);

        c3=new JButton(new ImageIcon("src/U1/MiPaint/Images/square-shape-shadow (2).png"));
        c3.addActionListener(this);
        c3.setPreferredSize(new Dimension(24,24));
        c3.setBackground(Color.YELLOW);
        jpEste.add(c3);

        c4=new JButton(new ImageIcon("src/U1/MiPaint/Images/square-shape-shadow (3).png"));
        c4.addActionListener(this);
        c4.setPreferredSize(new Dimension(24,24));
        c4.setBackground(Color.GREEN);
        jpEste.add(c4);

        add(jpEste,BorderLayout.EAST);


        //Oeste
        //
        JPanel jpOeste = new JPanel();
        jpOeste.setLayout(new BoxLayout(jpOeste,BoxLayout.Y_AXIS));
        jpOeste.setBackground(Color.gray);

        b=new JButton(new ImageIcon("src/U1/MiPaint/Images/oval.png"));
        b.addActionListener(this);
        b.setPreferredSize(new Dimension(30, 30));
        jpOeste.add(b);
        //JEnteroField n=new JEnteroField(9);
        //jpOeste.add(n);

        c=new JButton(new ImageIcon("src/U1/MiPaint/Images/2-squares.png"));
        c.addActionListener(this);
        c.setPreferredSize(new Dimension(30, 30));
        jpOeste.add(c);

        d=new JButton(new ImageIcon("src/U1/MiPaint/Images/diagonal-line.png"));
        d.addActionListener(this);
        d.setPreferredSize(new Dimension(30, 30));
        d.setBackground(Color.LIGHT_GRAY);
        jpOeste.add(d);

        JButton e = new JButton();
        e.addActionListener(this);
        e.setSize(2,2);
        e.setBackground(Color.ORANGE);


        f=new JButton(new ImageIcon("src/U1/MiPaint/Images/multi-tab (1).png"));
        f.addActionListener(this);
        f.setPreferredSize(new Dimension(30, 30));
        jpOeste.add(f);


        g=new JButton(new ImageIcon("src/U1/MiPaint/Images/oval-shape.png"));
        g.addActionListener(this);
        g.setSize(2,2);
        jpOeste.add(g);


        add(jpOeste,BorderLayout.WEST);

    }
    private void StatusBar(){
        jtbStatus=new JToolBar("Status" );
        jtbStatus.setFloatable(false);
        jtbStatus.setToolTipText("Barra de estado");

        jlblInfo =new JLabel("Listo");
        jlblInfo.setToolTipText("Informacion");
        jtbStatus.add(jlblInfo);
        jtbStatus.add(new JToolBar.Separator());
        jtbStatus.add(new JSeparator(JSeparator.VERTICAL));
        jtbStatus.add(new JToolBar.Separator());

        JLabel jlblCL = new JLabel("Contorno");
        jlblCL.setToolTipText("Color seleccionado para contorno");
        jtbStatus.add(jlblCL);
        jtbStatus.add(new JToolBar.Separator());
        contorno=new JPanel();
        contorno.setBackground(Color.WHITE);
        contorno.setMaximumSize(new Dimension(12,12));
        contorno.setPreferredSize(new Dimension(12,12));
        contorno.setMaximumSize(new Dimension(12,12));
        jtbStatus.add(contorno);
        jtbStatus.add(new JToolBar.Separator());
        jtbStatus.add(new JSeparator(JSeparator.VERTICAL));

        JLabel jlblCF = new JLabel("Relleno");
        jlblCF.setToolTipText("Color seleccionado para relleno");
        jtbStatus.add(jlblCF);
        jtbStatus.add(new JToolBar.Separator());
        relleno=new JPanel();
        relleno.setBackground(Color.WHITE);
        relleno.setMaximumSize(new Dimension(12,12));
        relleno.setPreferredSize(new Dimension(12,12));
        relleno.setMaximumSize(new Dimension(12,12));
        jtbStatus.add(relleno);
        jtbStatus.add(new JToolBar.Separator());
        jtbStatus.add(new JSeparator(JSeparator.VERTICAL));

        jlblHora =new JLabel("Hora actual");
        jlblHora.setToolTipText("Fecha y hora actual");
        jtbStatus.add(jlblHora);
        jtbStatus.add(new JToolBar.Separator());

        Timer tiempo = new Timer(1000, e -> ActualizaFecha());
        tiempo.start();

    }
    private void ActualizaStatus(String texto){
        jlblInfo.setText(texto);
        Timer t = new Timer(3000, e -> jlblInfo.setText("Listo"));
        t.start();
    }
    private void ActualizaFecha(){
        jlblHora.setText(Fecha.now());
    }
    private void BarraHerramientas() {
        //Configuracion geeneral

        jtbMain = new JToolBar("Herramientas");
        jtbMain.setFloatable(false);
        jtbMain.setToolTipText("Barra de Herramientas Principal");
        jtbMain.setBackground(Color.gray);
        //CONTENIDO
        jbtnNuevo =new JButton(new ImageIcon("src/U1/MiPaint/Images/new.png"));
        jbtnNuevo.setSize(200,200);
        jbtnNuevo.addActionListener(this);
        jbtnNuevo.setToolTipText("Crea nuevo archivo");
        jtbMain.add(jbtnNuevo);

        jbtnAbrir =new JButton(new ImageIcon("src/U1/MiPaint/Images/open.png"));
        jbtnAbrir.addActionListener(this);
        jbtnAbrir.setSize(200,200);
        jbtnAbrir.setToolTipText("Abrir existente");
        jtbMain.add(jbtnAbrir);

        jbtnGuardar =new JButton(new ImageIcon("src/U1/MiPaint/Images/save.png"));
        jbtnGuardar.addActionListener(this);
        jbtnGuardar.setToolTipText("Guardar archivo");
        jtbMain.add(jbtnGuardar);

        jbtnSalir=new JButton(new ImageIcon("src/U1/MiPaint/Images/exit.png"));
        jbtnSalir.addActionListener(this);
        jbtnSalir.setToolTipText("Sale de la aplicacion");
        jtbMain.add(jbtnSalir);

        //Figuras
        


    }

    public static void main(String []args){
        Paint cont=new Paint();
    }
    private void Menu(){
        JMenuBar jmbP = new JMenuBar();//Crea la barra de menus
        //Archivos
         {
             JMenu archivo = new JMenu("Archivos");//Crea el menu archivo
             archivo.setMnemonic('A');//Opcion alt

            jminuevo = new JMenuItem("Nuevo");
            jminuevo.setMnemonic('N');
            archivo.add(jminuevo);
            jminuevo.addActionListener(this);

            jmiabrir = new JMenuItem("Abrir");
            jmiabrir.setMnemonic('A');
            archivo.add(jmiabrir);
            jmiabrir.addActionListener(this);

            jmiguardar = new JMenuItem("Guardar");
            jmiguardar.setMnemonic('G');
            archivo.add(jmiguardar);
            jmiguardar.addActionListener(this);

            archivo.addSeparator();

            jmisalir = new JMenuItem("Salir");
            jmisalir.setMnemonic('S');
            archivo.add(jmisalir);
            jmisalir.addActionListener(this);


             rellenito=new JMenuItem("Rellenito: "+false);
             rellenito.setMnemonic('x');
             archivo.add(rellenito);
             rellenito.addActionListener(this);

             radio = new JRadioButton("Relleno");
             archivo.add(radio);
             radio.addActionListener(this);


            jmbP.add(archivo);

        }
        //Editar
        {
            JMenu editar = new JMenu("Editar");//Crea el menu editar
            editar.setMnemonic('E');//Opcion alt

            JMenuItem copiar = new JMenuItem("Copiar");
            copiar.setMnemonic('C');
            editar.add(copiar);
            copiar.addActionListener(this);

            JMenuItem cortar = new JMenuItem("Cortar");
            cortar.setMnemonic('O');
            editar.add(cortar);
            cortar.addActionListener(this);

            JMenuItem pegar = new JMenuItem("Pegar");
            pegar.setMnemonic('P');
            editar.add(pegar);
            pegar.addActionListener(this);

            JMenuItem rellenito=new JMenuItem("Rellenito");
            rellenito.setMnemonic('a');
            editar.add(rellenito);
            editar.addActionListener(this);


            jmbP.add(editar);

        }
        //Ayuda
        {
            JMenu ayuda1 = new JMenu("Ayuda");//Crea el menu editar
            ayuda1.setMnemonic('Y');//Opcion alt

            JMenuItem ayuda = new JMenuItem("Ayuda");
            ayuda.setMnemonic('A');
            ayuda1.add(ayuda);
            ayuda.addActionListener(this);

            JMenuItem acerca = new JMenuItem("Acerca de ");
            acerca.setMnemonic('D');
            ayuda1.add(acerca);
            acerca.addActionListener(this);

            jmbP.add(ayuda1);


        }
        setJMenuBar(jmbP);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jbtnSalir || e.getSource()==jmisalir){
            ActualizaStatus("Adios");
            if(JOptionPane.showConfirmDialog(null,"Seguro","Aviso",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                System.exit(0);
            }
        }
        if(e.getSource()==jminuevo || e.getSource()==jbtnNuevo){
            ActualizaStatus("Borrar Lienzo");
            jpCentro.BorraLienzo();
        }
        if(e.getSource()==jbtnGuardar || e.getSource()==jmiguardar){
            ActualizaStatus("Guardar Archivo");
            JFileChooser guarda=new JFileChooser();
            guarda.showSaveDialog(this);
            File NomArch=guarda.getSelectedFile();
            //JOptionPane.showMessageDialog(null,"El archivo es "+NomArch.getName(),"Aviso del sistema",JOptionPane.OK_OPTION);
            try {
                Archivos.Archivo(NomArch.toString(), 'W');
                Figuras F;
                ArrayList<Figuras> contenido=jpCentro.getContenido();
                for (Figuras figuras : contenido) {
                    F = figuras;
                    Archivos.AgregaRegistro(F);
                }
                Archivos.CerrarArchivo();
            }catch(IOException er){
                JOptionPane.showMessageDialog(null,"Error al guardar archivo"+NomArch.getName());

            }

        }
        if(e.getSource()==jmiabrir || e.getSource()==jbtnAbrir){
            ActualizaStatus("Abrir Archivo");
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Indique la imagen");
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            chooser.setCurrentDirectory(new File("E:"));
            chooser.setAcceptAllFileFilterUsed(true);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagenes","mpp","png");
            chooser.setFileFilter(filter);
            if(chooser.showOpenDialog(this)== JFileChooser.APPROVE_OPTION){
                String NomImg= chooser.getSelectedFile().getName();
                String carpeta = chooser.getSelectedFile().getPath();
                try{
                    Archivos.Archivo(carpeta,'r');
                    jpCentro.setContenido(Archivos.LeeContenido());
                    Archivos.CerrarArchivo();
                }catch(IOException er) {
                    JOptionPane.showMessageDialog(null, "El archivo seleccionado es " + carpeta,
                            "Aviso del sistema", JOptionPane.OK_OPTION);
                }
            }
        }
        if(e.getSource()==radio){
            jpCentro.setRelleno(!jpCentro.isRelleno());

        }
        if(e.getSource()==a){
            ActualizaStatus("Selecciono Color");
            jpCentro.setColor(JColorChooser.showDialog(this,"Elige un color",Color.WHITE));
            contorno.setBackground(jpCentro.getColor());
            relleno.setBackground(jpCentro.getColor());
        }
        if(e.getSource()==b){
            ActualizaStatus("Circulo");
            jpCentro.setFigura(3);
        }
        if(e.getSource()==c){
            ActualizaStatus("Rectangulo");

            jpCentro.setFigura(2);
        }
        if(e.getSource()==d){
            ActualizaStatus("Linea");
            jpCentro.setFigura(0);
        }
        if(e.getSource()==f){
            ActualizaStatus("Cuadrado");
            jpCentro.setFigura(4);
        }
        if(e.getSource()==g){
            ActualizaStatus("Ovalo");
            jpCentro.setFigura(1);
        }
        if(e.getSource()==c1){
            ActualizaStatus("Selecciono Color");
            jpCentro.setColor(Color.RED);
            contorno.setBackground(jpCentro.getColor());
            relleno.setBackground(jpCentro.getColor());

        }
        if(e.getSource()==c2){
            ActualizaStatus("Selecciono Color");
            jpCentro.setColor(Color.BLUE);
            contorno.setBackground(jpCentro.getColor());
            relleno.setBackground(jpCentro.getColor());
        }
        if(e.getSource()==c3){
            ActualizaStatus("Selecciono Color");
            jpCentro.setColor(Color.yellow);
            contorno.setBackground(jpCentro.getColor());
            relleno.setBackground(jpCentro.getColor());
        }
        if(e.getSource()==c4){
            ActualizaStatus("Selecciono Color");
            jpCentro.setColor(Color.GREEN);
            contorno.setBackground(jpCentro.getColor());
            relleno.setBackground(jpCentro.getColor());
        }






    }
}
