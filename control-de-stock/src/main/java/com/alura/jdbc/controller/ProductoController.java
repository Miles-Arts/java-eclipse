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

import com.alura.jdbc.dao.ProductoDAO;
import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Producto;

public class ProductoController {

	private ProductoDAO productoDAO;

	public ProductoController() {
		
		this.productoDAO =  new ProductoDAO(new ConnectionFactory().recuperaConexion());
		
	}
	
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

	//Metodo listar
	public List<Producto> listar()  {
		
		return productoDAO.listar();
		
			
}
	
    public void guardar(Producto producto)  {
    	
    	productoDAO.guardar(producto);		
    		
	}		 

	private boolean tieneFilaElegida() {
		// TODO Auto-generated method stub
		return false;
	}
    

}
