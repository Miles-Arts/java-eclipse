package com.alura.jdbc.controller;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoController {

	public void modificar(String nombre, String descripcion, Integer id) {
		// TODO
	}

	public void eliminar(Integer id) {
		// TODO
	}

	public List<?> listar() throws SQLException {
		
		Connection con = DriverManager.getConnection(
				"jdb:mysql://localhost/control_de_stock?useTimeZonetrue&serverTomeZone=UTC", 
				"root", 
				"github");
		
		System.out.println("Cerrando conexión");
		
		Statement statement = con.createStatement();
		
		boolean execute	= tatement.execute("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");
		
		con.close();
		
		return new ArrayList<>();
	}

    public void guardar(Object producto) {
		// TODO
	}

}
