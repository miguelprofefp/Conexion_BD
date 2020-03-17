package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConexion {
	
	public static Connection getConexion(){
		
		Connection con = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/STRUTS2";
			String usr = "root";
			String psw = "root";
			
			con = DriverManager.getConnection(url,usr,psw);
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error >> Driver no Instalado");
		} catch (SQLException e) {
			
			System.out.println("Error >> de conexion con la BD");
		}
		
		return con;
	}

}
