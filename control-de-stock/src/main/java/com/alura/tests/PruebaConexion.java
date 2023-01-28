package com.alura.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {

	public static void main(String[] args) throws SQLException {
		
		System.out.println("Abriendo Conexión");
		
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC", 
				"root", 
				"github");
		
		System.out.println("Actualizando...");
		System.out.println("Cerrando conexión");
		
		con.close();
	}
	
}
