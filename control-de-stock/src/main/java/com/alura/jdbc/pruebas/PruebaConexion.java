package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {

    public static void main(String[] args) throws SQLException {
    	
    	System.out.println("Abriendo la conexión");
    	
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC",
                "root",
                "github");

        
        System.out.println("Analizando...");
        System.out.println("Cerrando la conexión...");

        con.close();
    }

}
