package com.alura.jdbc.factory;

import java.sql.Connection; 
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	
	private DataSource datasource;
	
	public ConnectionFactory() {

		
		//creando POOL Conections
		var pooledDataSource = new ComboPooledDataSource();
		
		pooledDataSource.setJdbcUrl("jdbc:mysql://localhost/control_de_stock?useTimeZonetrue&serverTomeZone=UTC");
		
		pooledDataSource.setUser("root");
		pooledDataSource.setPassword("github");
		
		this.datasource = pooledDataSource;
		
	}
	
	public Connection recuperaConexion() throws SQLException {
		
		//Devolver la conexion con RETURN
		//Connection con = DriverManager.getConnection(
				//"jdbc:mysql://localhost/control_de_stock?useTimeZonetrue&serverTomeZone=UTC", 
				//"root", 
				//"github");
		
		return this.datasource.getConnection();
		
	}
	
}
