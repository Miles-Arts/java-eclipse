package com.alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Producto;

public class ProductoDAO {
	
	
	final private Connection con;
	
	public ProductoDAO(Connection con) {
		
		this.con = con;
		
	}
	
	 public void guardar(Producto producto) {
	 
        try(con) {
      	 
	          //con.setAutoCommit(false);
	        
	          final PreparedStatement statement = con.prepareStatement("INSERT INTO PRODUCTO "
                      + "(nombre, descripcion, cantidad)"
                      + " VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
	
		 	try (statement) {
					ejecutaRegistro(producto, statement);
					
					//con.commit();
				
		 		}	//System.out.println("COMMIT");
				 	
		 	} catch(SQLException e ) {
				 
			//e.printStackTrace();				 
			//System.out.println("ROLLBACK");
			//con.rollback();
				 
		 		throw new RuntimeException(e);	
			}
       }
	
	
	 private void ejecutaRegistro(Producto producto, PreparedStatement statement)
					throws SQLException {
			
				
				statement.setString(1, producto.getNombre());
				statement.setString(2, producto.getDescripcion());
				statement.setInt(3, producto.getCantidad());
				
				statement.execute();

				final ResultSet resultSet = statement.getGeneratedKeys();
				try(resultSet) {
					
				while (resultSet.next()) {
					producto.setId(resultSet.getInt(1));
					System.out.println(String.format(
								"Fue insertado el producto %s", producto ));	 		 
			}
		}
			
	}

	 public List<Map<String, String>> listar() {
				
				List<Map<String, String>> resultado = new ArrayList<>();
				
				System.out.println("Conexión true...");
				
				ConnectionFactory factory = new ConnectionFactory();
				final Connection con = new ConnectionFactory().recuperaConexion();
				
				try(con) {
			//Statement statement = con.createStatement();
				
					final PreparedStatement statement = con.prepareStatement("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");
					
					try(statement) {
					
						statement.execute();
						
						final ResultSet resultSet =  statement.getResultSet();
				
					try(resultSet) {
						while (resultSet.next()) {
					
							Map<String, String> fila = new HashMap<>();
							fila.put("ID", String.valueOf( resultSet.getInt("ID")));
							fila.put("NOMBRE", resultSet.getString("NOMBRE"));
							fila.put("DESCRIPCION", resultSet.getString("DESCRIPCION"));
							fila.put("CANTIDAD", String.valueOf( resultSet.getInt("CANTIDAD")));
							
							resultado.add(fila);
						}
					}
				}
						return resultado;
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
				
	}
}

	
	


