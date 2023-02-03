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
import com.alura.jdbc.modelo.Categoria;
import com.alura.jdbc.modelo.Producto;

public class ProductoController {

	private ProductoDAO productoDAO;

	  public ProductoController() {
		  
	        var factory = new ConnectionFactory();
	        
	        this.productoDAO = new ProductoDAO(factory.recuperaConexion());
	    }

	
	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) {

		    //ProductoController productoDAO = new ProductoController();
			return productoDAO.modificar(nombre, descripcion, cantidad, id);
	
	}
  
	public int eliminar(Integer id) {
	    
		productoDAO.eliminar(id);
		
		return productoDAO.eliminar(id);
	}

	//Metodo listar
	public List<Producto> listar()  {
		
		return productoDAO.listar();
		
	}
	
	public List<Producto> listar(Categoria categoria) {
		
		return productoDAO.listar(categoria.getId());
		
	}
	
	
	
    public void guardar(Producto producto, Integer categoriaId)  {
    	
    	producto.setCategoriaId(categoriaId);
    	productoDAO.guardar(producto);		
    		
	}		 

	
 
}
