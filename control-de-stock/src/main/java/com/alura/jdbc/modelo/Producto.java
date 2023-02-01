package com.alura.jdbc.modelo;

public class Producto {
	
		
		private Integer id;
		
		
		private String nombre;
		
		
		private String descripcion;
		
		
		private Integer cantidad;
		
		public Producto(String nombre, String descripcion, Integer cantidad) {
			
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.cantidad = cantidad;
			
		}

		public String getNombre() {
			return nombre;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public Integer getCantidad() {
			return cantidad;
		}
		
		

}
