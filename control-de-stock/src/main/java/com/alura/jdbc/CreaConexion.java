package com.alura.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreaConexion {

	public Connection recuperaConexion() throws SQLException {
		
		//Devolver la conexion con RETURN
		//Connection con = DriverManager.getConnection(
				//"jdbc:mysql://localhost/control_de_stock?useTimeZonetrue&serverTomeZone=UTC", 
				//"root", 
				//"github");
		
		return DriverManager.getConnection(
				"jdbc:mysql://localhost/control_de_stock?useTimeZonetrue&serverTomeZone=UTC", 
				"root", 
				"github");
		
	}
	
}
