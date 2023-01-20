package com.bytebank.modelo;

public class Contador extends Funcionario {
	
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		
		//return super.getBonificacion();
		System.out.println("Ejecuntado contador");
		return 200;
	}

}
