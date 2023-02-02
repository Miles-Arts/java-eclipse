package com.alura.jdbc.controller;

import java.util.ArrayList;
import java.util.List;

import com.alura.jdbc.dao.CategoriaDAO;
import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Categoria;

public class CategoriaController {

	private CategoriaDAO categoriaDAO;
	
	
	public CategoriaController() {
		
		//inicializando el DAO
		var factory = new ConnectionFactory();
		this.categoriaDAO = new CategoriaDAO(factory.recuperaConexion());
		
	}
	
	public List<Categoria> listar() {
		
		return categoriaDAO.listar();
	}

    public List<?> cargaReporte() {
  
        return new ArrayList<>();
    }

}
