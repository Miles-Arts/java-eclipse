package com.alura.jdbc.pruebas;

import java.sql.Connection;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaPoolDeConexiones {
	
	public static void main(String[] args) {
		
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		for (int i = 0; i < 0; i++) {
			
			Connection conexion = connectionFactory.recuperaConexion();
			
			System.out.print("Abriendo la conexión de número " + i +1);
			
		}
		
		
	}

}
