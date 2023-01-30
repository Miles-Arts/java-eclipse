package com.alura.jdbc.pruebas;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

import com.alura.jdbc.CreaConexion;

public class PruebaConexion {

    public static void main(String[] args) throws SQLException {
    	
    	System.out.println("Abriendo la conexión");
    	
    	Connection con = new CreaConexion().recuperaConexion();

        
        System.out.println("Analizando...");
       
        con.close();
        
        System.out.println("Cerrando la conexión...");
    }

}
