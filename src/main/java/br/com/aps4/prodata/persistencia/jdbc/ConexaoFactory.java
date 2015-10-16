package br.com.aps4.prodata.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection(){
		try {
			return DriverManager.getConnection("jdbc:sqlserver://servidor:1433","sa", "sa123");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		
	}
}
