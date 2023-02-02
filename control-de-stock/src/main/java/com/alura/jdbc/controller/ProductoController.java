package com.alura.jdbc.controller;

/***
 * CREANDO TIENDA 
 * CORRECIÓN CÓDIGO
 * @author Alura and Miles
 */

import java.sql.Connection;     

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.swing.JOptionPane;

import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Producto;
import com.alura.jdbc.persistencia.PersistenciaProducto;

public class ProductoController {

	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) throws SQLException {
		
        ConnectionFactory factory = new ConnectionFactory();
        final Connection con = factory.recuperaConexion();

        
        try(con) {
	        final PreparedStatement statement = con.prepareStatement("UPDATE PRODUCTO SET "
	                + " NOMBRE = ? "
	        		+ " DESCRIPCION = ? "
	                + " CANTIDAD = ? " 
	                + " WHERE ID = ? ");
	        
	        	try(statement) {
	        	statement.setString(1, nombre);
	        	statement.setString(2, descripcion);
	        	statement.setInt(3, cantidad);
	        	statement.setInt(4, id);
	        
	        
				statement.execute();   
		        //statement.execute( + id);
		        
		        int updateCount = statement.getUpdateCount();
		        
		        con.close();
		        
		        return updateCount;
	        }
        }
    }
	


	public int eliminar(Integer id) throws SQLException {
		
	
		ConnectionFactory factory = new ConnectionFactory();
		
		final Connection con = new ConnectionFactory().recuperaConexion();

		//Statement statement = con.createStatement();
		
		try(con) {
			final PreparedStatement statement = con.prepareStatement("DELETE FROM PRODUCTO WHERE ID = ?");
			try(statement) {
				statement.setInt(1, id);
				
				statement.execute();
				
				//int updateCount = statement.getUpdateCount();
			
				return statement.getUpdateCount();
			}
			}
		}

	public List<Map<String, String>> listar() throws SQLException {
		
		System.out.println("Conexión true...");
		
		final Connection con = new ConnectionFactory().recuperaConexion();
		
		try(con) {
	//Statement statement = con.createStatement();
		
			final PreparedStatement statement = con.prepareStatement("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");
			
			try(statement) {
			
				statement.execute();
				
				ResultSet resultSet =  statement.getResultSet();
				
				
				List<Map<String, String>> resultado = new ArrayList<>();
				
				while (resultSet.next()) {
					
				
					Map<String, String> fila = new HashMap<>();
					fila.put("ID", String.valueOf( resultSet.getInt("ID")));
					fila.put("NOMBRE", resultSet.getString("NOMBRE"));
					fila.put("DESCRIPCION", resultSet.getString("DESCRIPCION"));
					fila.put("CANTIDAD", String.valueOf( resultSet.getInt("CANTIDAD")));
					
					resultado.add(fila);
					
				}
				
				return resultado;
				
			}
	
		}	
	}
	
    public void guardar(Producto producto) throws SQLException {
    	
    		PersistenciaProducto persistenciaProducto = new PersistenciaProducto(new ConnectionFactory().recuperaConexion());
    	
    persistenciaProducto.guardarProducto(producto);		
    		
	}		 

	private boolean tieneFilaElegida() {
		// TODO Auto-generated method stub
		return false;
	}
    

}
