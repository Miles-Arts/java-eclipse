package com.alura.jdbc.controller;

import java.sql.Connection;  

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductoController {

	public void modificar(String nombre, String descripcion, Integer id) {
		// TODO
	}

	public void eliminar(Integer id) {
		// TODO
	}

	public List<Map<String, String>> listar() throws SQLException {
		
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/control_de_stock?useTimeZonetrue&serverTomeZone=UTC", 
				"root", 
				"github");
		
		
		
		Statement statement = con.createStatement();
		
		//boolean result = statement.execute("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");
		
		statement.execute("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");
		
		ResultSet resultSet =  statement.getResultSet();
		
		
		List<Map<String, String>> resultado = new ArrayList<>();
		
		while (resultSet.next()) {
			
		
			Map<String, String> fila = new HashMap<>();
			fila.put("ID", String.valueOf( resultSet.getInt("ID")));
			fila.put("NOMBRE", resultSet.getString("NOMBRE"));
			fila.put("DESCRIPCION", resultSet.getString("DESCRIPCION"));
			fila.put("CANTIDAD", String.valueOf( resultSet.getInt("CANTIDAD")));
			
			resultado.add(fila);
			System.out.println("Cerrando Conexión");
		}
		
		con.close();

		return resultado;
		
	}
	
    public void guardar(Object producto) {
		// TODO
	}
    
    

}
