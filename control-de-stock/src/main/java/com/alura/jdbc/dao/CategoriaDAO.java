package com.alura.jdbc.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.alura.jdbc.modelo.Categoria;

public class CategoriaDAO {
	
	
	private Connection con;

	public CategoriaDAO(Connection con) {

		this.con = con;
		
	}

	public List<Categoria> listar() {

		List<Categoria> resultado = new ArrayList<>();
		
		return resultado;
	}

}
