package AccesoDatos.dbAccesL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexionDB {
	@SuppressWarnings("finally")
	public static Connection GetConnection() {
		Connection conexion=null;
		try {
			Class.forName("com.mysq.jdbc.Driver");
			conexion=DriverManager.getConnection("jdbc:mysql://localhost/NombreBD,usuario,contraseña");
		}catch(ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null,e, "Error con la clase del driver de Mysql: "+e.getMessage(),JOptionPane.ERROR_MESSAGE);
			conexion=null;
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e,"Error en la conexion con la BD: "+e.getMessage(),JOptionPane.ERROR_MESSAGE);
			conexion=null;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e, "Error del sistema: "+e.getMessage(),JOptionPane.ERROR_MESSAGE);
			conexion=null;
		}finally {
			return conexion;
		}
	}

}
