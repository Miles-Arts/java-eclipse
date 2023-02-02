package com.alura.jdbc.factory;

import java.sql.Connection; 
import java.sql.SQLException;

import javax.management.RuntimeErrorException;
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
		pooledDataSource.setMaxPoolSize(10);
		
		this.datasource = pooledDataSource;
		
	}
	
	public Connection recuperaConexion() {
	
		try {
			
			return this.datasource.getConnection();
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
			
		}
		
	}
	
}
