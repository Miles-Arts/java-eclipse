package com.bytebank.test;

public class TestMain {

	public static void main(String[] args) {
		
		int edad = 20;
		int edad2 = 15;
		int edad3 = 67;
		
		//como hago paa agruparlas en 1 referencia?
		
		//Indices, número de posición  de cada sección del array
		//numero del indice:  0   1   2   3   4
		//		array       [ 0 | 1 | 2 | 3 | 4 ]
		int[] edades = new int[5];
		edades[2] = 30; 
		
		//System.out.println(edades[2]);
		//System.out.println(edades[3]);
		//System.out.println(edades[1]);
		
		int tamanoArray = edades.length;
		
		//System.out.println(tamanoArray);
		
		for (int i = 0; i < tamanoArray; i++  ) {
			System.out.println(edades[i]);
		}
	}
	
}

