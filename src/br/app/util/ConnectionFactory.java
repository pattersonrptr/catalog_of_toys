package br.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection()  throws SQLException , ClassNotFoundException {  
		Class.forName("com.mysql.jdbc.Driver");

		//Configura os par�metros da conex�o  
		String url = "jdbc:mysql://localhost:3306/brinquedos";  
		String username = "patterson";   
		String password = "*sue1990*";  

		//Processa e retorna a conex�o
		return DriverManager.getConnection(url, username, password);  
	}	
}
