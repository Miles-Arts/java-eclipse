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
	
	
	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) 

		    ProductoController productoDao;
			return productoDao.modificar(nombre, descripcion, cantidad, id);
	
		}
    }
	


	public int eliminar(Integer id) {
	    
		productoDAO.eliminar(id);
		
		return productoDAO.eliminar(id);
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
