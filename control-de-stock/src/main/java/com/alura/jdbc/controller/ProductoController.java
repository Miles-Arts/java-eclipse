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
			//con.close();

		
		}	
	}
	
    public void guardar(Map<String, String> producto) throws SQLException {
    	
    	String nombre = producto.get("NOMBRE");
    	  
    	 String descripcion = producto.get("DESCRIPCION");
    	 
    	 Integer cantidad = Integer.valueOf(producto.get("CANTIDAD"));
    	
    	 Integer maximoCantidad = 50;
    	 
    	  ConnectionFactory factory = new ConnectionFactory();
          final Connection con = factory.recuperaConexion();
          
          try(con) {
        	 
	          con.setAutoCommit(false);
	        
		 	final PreparedStatement statement = con.prepareStatement( "INSERT INTO PRODUCTO" 
		 		+ "(nombre, descripcion, cantidad)" 
		 		+ " VALUES (?,?,?)",
		 		Statement.RETURN_GENERATED_KEYS);
	
		 	try (statement) {
				 
				 do {
					 int cantidadParaGuardar = Math.min(cantidad, maximoCantidad);
					 
					 ejecutaRegistro(nombre, descripcion, cantidadParaGuardar, statement);
					 
					 cantidad -= maximoCantidad;
					 
				 	} while(cantidad > 0);
				 
				 	con.commit();
				
				 	System.out.println("COMMIT");
				 	
			 } catch(Exception e ) {
				 con.rollback();
				 System.out.println("ROLLBACK");
			 }
		 }		 
		 //statement.close();
		 //con.close();
     } 	 
	


	private void ejecutaRegistro(String nombre, String descripcion, Integer cantidad, PreparedStatement statement)
			throws SQLException {
		
		/*if (cantidad < 50 ) {
			
			throw new RuntimeException("Ocurrio un error");
			
		}*/
		
		statement.setString(1, nombre);
		statement.setString(2, descripcion);
		statement.setInt(3, cantidad);
		
		statement.execute();
		 
		
		//try-with-resource JAVA 7
		/*try(ResultSet resultSet = statement.getGeneratedKeys();) {
	
			while (resultSet.next()) {
				System.out.println(String.format(
						"Fue insertado el producto de ID: %d", resultSet.getInt(1)));	 		 
		 }
		}*/
		
		
		//try-with-resource JAVA 9
		final ResultSet resultSet = statement.getGeneratedKeys();
		try(resultSet) {
			
			while (resultSet.next()) {
				System.out.println(String.format(
						"Fue insertado el producto de ID: %d", resultSet.getInt(1)));	 		 
		 }
		}
	
		//resultSet.close();
	}
 
	private boolean tieneFilaElegida() {
		// TODO Auto-generated method stub
		return false;
	}
    

}
