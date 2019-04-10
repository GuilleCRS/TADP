package AccesoDatos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JMenuBar;

public class Interfaz implements ActionListener {
	JButton btnAgregarProducto,btnRegistrarCliente;
	private JFrame frame;
	JDialog jd1,jd2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Interfaz window = new Interfaz();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		btnAgregarProducto = new JButton("Registrar Producto");
		menuBar.add(btnAgregarProducto);
		btnAgregarProducto.addActionListener(this);
		
		btnRegistrarCliente = new JButton("Registrar Cliente");
		menuBar.add(btnRegistrarCliente);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 444, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 246, Short.MAX_VALUE)
		);
		frame.getContentPane().setLayout(groupLayout);
		btnRegistrarCliente.addActionListener(this);
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
		
		if(e.getSource()==btnAgregarProducto) {
			jd1.setVisible(true);
		}
		if(e.getSource()==btnRegistrarCliente) {
			jd2.setVisible(true);
		}
	}
}
