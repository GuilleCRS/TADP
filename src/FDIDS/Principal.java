package FDIDS;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame implements ActionListener {
	JButton Cliente,Inventario,EventoR,BuscaEve;
	JButton btnAgregarProducto,btnRegistrarCliente;
	JDialog jd1,jd2;
	public Principal() {
		Init();
	}
    public static void main(String []Argas){
    	Principal prin=new Principal();
    
    }
    private void Init() {
    	   JToolBar Norte;
    	   ImageIcon n= new ImageIcon("886.png");
           JFrame ps=new JFrame();
           setVisible(true);
           setTitle("Fema Eventos");
           setIconImage(n.getImage());
           setBackground(new Color(43, 17, 5));
           setSize(500,500);
           setLocationRelativeTo(null);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           Norte =new JToolBar();
           Norte.setFloatable(false);;
           Norte.setBackground(Color.gray);
           Norte.setVisible(true);
           JPanel Sur = new JPanel();
           JPanel Centro= new JPanel();
           JPanel Este=new JPanel();
           JPanel Oeste=new JPanel();
           JLabel imagen = new JLabel(new ImageIcon("886.png"));
           imagen.setPreferredSize(new Dimension(150,150));
           imagen.setBackground(new Color(43, 17, 5));
           Oeste.add(imagen);
           JLabel ima = new JLabel("Para accesar a la zona del cliente, registro e inventarios inicie sesion");
           ima.setForeground(Color.WHITE);
           JLabel usr = new JLabel("Usuario:");
           usr.setForeground(Color.white);
           JTextField Usuario = new JTextField("Ingrese usuario");
           Usuario.setSize(300,20);
           Usuario.setMaximumSize(new Dimension(300,20));
           Usuario.setPreferredSize(new Dimension(300,20));
           Usuario.setForeground(Color.LIGHT_GRAY);
           JLabel contra=new JLabel("Contraseña:");
           contra.setForeground(Color.white);
           JTextField Contraseña = new JTextField("Ingrese Contraseña");
           Contraseña.setSize(300,20);
           Contraseña.setMaximumSize(new Dimension(300,20));
           Contraseña.setPreferredSize(new Dimension(300,20));
           Contraseña.setForeground(Color.LIGHT_GRAY);
           JButton ini = new JButton("Iniciar Sesion");

           Centro.setLayout(new BoxLayout(Centro,BoxLayout.Y_AXIS));
           Centro.add(ima);
           Centro.add(usr);
           Centro.add(Usuario);
           Centro.add(contra);
           Centro.add(Contraseña);
           Centro.add(new JLabel(" "));
           Centro.add(ini);

           //Centro.add(ima,BorderLayout.WEST);
           Sur.setBackground(new Color(43, 17, 5));
           Centro.setBackground(new Color(43, 17, 5));
           Este.setBackground(new Color(43, 17, 5));
           Oeste.setBackground(new Color(43, 17, 5));
           add(Centro,BorderLayout.CENTER);
           add(Sur,BorderLayout.SOUTH);
           add(Este,BorderLayout.EAST);
           add(Oeste,BorderLayout.WEST);
   	        Cliente =new JButton("Cliente");
   	        Cliente.addActionListener(this);
           Inventario=new JButton("Inventario");
           Inventario.addActionListener(this);
           EventoR = new JButton("Registro Eventos");
           BuscaEve=new JButton("Buscar");
           Norte.add(Cliente);
           Norte.add(Inventario);
           Norte.add(EventoR);
           Norte.add(BuscaEve);
          
           //BuscaEve.setPreferredSize(new Dimension(50,50));

           JTextField bus=new JTextField("Numero de evento/cliente");
           bus.setForeground(Color.LIGHT_GRAY);
           bus.addMouseListener(new MouseAdapter() {
               @Override
               public void mouseClicked(MouseEvent e) {
                   super.mouseClicked(e);
                   bus.setText(" ");
                   bus.setForeground(Color.BLACK);
               }
           });
           Norte.add(bus);
           add(Norte,BorderLayout.NORTH);
           RegistroProducto();
    	   RegistroCliente();
    }
    private void RegistroProducto() {
    	//Boton Registro producto
    	
    		JLabel lblClaveProducto = new JLabel("Clave Producto:");
    		JLabel lblDescripcion = new JLabel("Descripcion:");
    		JLabel lblPrecio = new JLabel("Precio:");
    		JLabel lblExistencia = new JLabel("Existencia:");
    		JLabel lblEstatus = new JLabel("Estatus:");
		JTextField textField = new JTextField();
    		textField.setColumns(10);
		JTextField textField_1 = new JTextField();
    		textField_1.setColumns(10);
		JTextField textField_2 = new JTextField();
    		textField_2.setColumns(10);
		JTextField textField_3 = new JTextField();
    		textField_3.setColumns(10);
    		JComboBox comboBox = new JComboBox();
    		//comboBox.addItem("A");
    		JButton btnRegistrar = new JButton("Registrar");
    		JPanel jp=new JPanel();
    		jd1=new JDialog();
    		jd1.getContentPane().add(jp);
    		jd1.setTitle("Registro Producto");
    		jd1.setVisible(false);
    		jd1.setSize(300, 300);
    		jd1.setResizable(false);
    		GroupLayout gl_panel = new GroupLayout(jp);
    		gl_panel.setHorizontalGroup(
    			gl_panel.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addContainerGap()
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
    						.addGroup(gl_panel.createSequentialGroup()
    							.addComponent(lblClaveProducto)
    							.addPreferredGap(ComponentPlacement.RELATED)
    							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addComponent(lblDescripcion)
    							.addPreferredGap(ComponentPlacement.RELATED)
    							.addComponent(textField_1))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addComponent(lblPrecio)
    							.addPreferredGap(ComponentPlacement.RELATED)
    							.addComponent(textField_2))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addComponent(lblExistencia)
    							.addPreferredGap(ComponentPlacement.RELATED)
    							.addComponent(textField_3))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addComponent(lblEstatus)
    							.addPreferredGap(ComponentPlacement.RELATED)
    							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
    					.addContainerGap(195, Short.MAX_VALUE))
    				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
    					.addContainerGap(315, Short.MAX_VALUE)
    					.addComponent(btnRegistrar)
    					.addContainerGap())
    		);
    		gl_panel.setVerticalGroup(
    			gl_panel.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addContainerGap()
    					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
    						.addComponent(lblClaveProducto)
    						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    					.addGap(18)
    					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
    						.addComponent(lblDescripcion)
    						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    					.addGap(18)
    					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
    						.addComponent(lblPrecio)
    						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    					.addGap(18)
    					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
    						.addComponent(lblExistencia)
    						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    					.addGap(18)
    					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
    						.addComponent(lblEstatus)
    						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    					.addPreferredGap(ComponentPlacement.UNRELATED)
    					.addComponent(btnRegistrar)
    					.addContainerGap(25, Short.MAX_VALUE))
    		);
    		jp.setLayout(gl_panel);
    		
    	}
        private void RegistroCliente() {
        	//Boton Registro Cliente
        			JLabel lblClaveProducto = new JLabel("Clave Cliente:");
        			JLabel lblDescripcion = new JLabel("Nombre:");
        			JLabel lblPrecio = new JLabel("RFC:");
        			JLabel lblExistencia = new JLabel("Domicilio:");
        			JLabel lblEstatus = new JLabel("Estatus:");
			JTextField cveclien = new JTextField();
        			cveclien.setColumns(10);
			JTextField nombreclien = new JTextField();
        			nombreclien.setColumns(10);
			JTextField rfclien = new JTextField();
        			rfclien.setColumns(10);
			JTextField domiciclien = new JTextField();
        			domiciclien.setColumns(10);
        			JComboBox comboBox = new JComboBox();
        			//comboBox.addItem("A");
        			JButton btnRegistrar = new JButton("Registrar");
        			JPanel jp=new JPanel();
        			jd2=new JDialog();
        			jd2.getContentPane().add(jp);
        			jd2.setTitle("Registro Cliente");
        			jd2.setVisible(false);
        			jd2.setSize(300, 300);
        			jd2.setResizable(false);
        			GroupLayout gl_panel = new GroupLayout(jp);
        			gl_panel.setHorizontalGroup(
        				gl_panel.createParallelGroup(Alignment.LEADING)
        					.addGroup(gl_panel.createSequentialGroup()
        						.addContainerGap()
        						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
        							.addGroup(gl_panel.createSequentialGroup()
        								.addComponent(lblClaveProducto)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(cveclien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        							.addGroup(gl_panel.createSequentialGroup()
        								.addComponent(lblDescripcion)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(nombreclien))
        							.addGroup(gl_panel.createSequentialGroup()
        								.addComponent(lblPrecio)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(rfclien))
        							.addGroup(gl_panel.createSequentialGroup()
        								.addComponent(lblExistencia)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(domiciclien))
        							.addGroup(gl_panel.createSequentialGroup()
        								.addComponent(lblEstatus)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
        						.addContainerGap(195, Short.MAX_VALUE))
        					.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
        						.addContainerGap(315, Short.MAX_VALUE)
        						.addComponent(btnRegistrar)
        						.addContainerGap())
        			);
        			gl_panel.setVerticalGroup(
        				gl_panel.createParallelGroup(Alignment.LEADING)
        					.addGroup(gl_panel.createSequentialGroup()
        						.addContainerGap()
        						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        							.addComponent(lblClaveProducto)
        							.addComponent(cveclien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addGap(18)
        						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        							.addComponent(lblDescripcion)
        							.addComponent(nombreclien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addGap(18)
        						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        							.addComponent(lblPrecio)
        							.addComponent(rfclien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addGap(18)
        						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        							.addComponent(lblExistencia)
        							.addComponent(domiciclien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addGap(18)
        						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        							.addComponent(lblEstatus)
        							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addPreferredGap(ComponentPlacement.UNRELATED)
        						.addComponent(btnRegistrar)
        						.addContainerGap(25, Short.MAX_VALUE))
        			);
        			jp.setLayout(gl_panel);
        			
        }
    	
        
        @Override
    	public void actionPerformed(ActionEvent e) {
    		
    		if(e.getSource()==Inventario) {
    			jd1.setVisible(true);
    		}
    		if(e.getSource()==Cliente) {
    			jd2.setVisible(true);
    		}
    	}
}
