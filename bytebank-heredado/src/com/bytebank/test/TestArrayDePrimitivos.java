package com.bytebank.test;

public class TestArrayDePrimitivos {

	public static void main(String[] args) {

		int[] edades = new int[5];

		//edades[0] = 29;
		//edades[1] = 39;
		//edades[2] = 49;
		//edades[3] = 59;
		//edades[4] = 69;

		//int edad4 = edades[3];
		

		 for (int i = 0; i < edades.length; i++) {
	            edades[i] = i * i;
	            
		 }
		 
		 for (int i = 0; i < edades.length; i++) {
	            System.out.println(edades[i]);
	        }
        //System.out.println(edad4);
        //System.out.println(edades.length);
	}	
}
