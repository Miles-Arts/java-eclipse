package com.bytebank.test;

public class TestWrappers {
	
	public static void main(String[] args) {
		
		Double numeroDoble = 33.0; // autoboxing
		Boolean verdadero = true; // autoboxing
				
		Double numeroDouble2 = Double.valueOf(33);
		
		System.out.println(numeroDouble2);
		
		
		String numeroString = "43";
		
		double stringToDouble = Double.valueOf(numeroString);
		Integer stringToInteger = Integer.valueOf(numeroString);
		
		System.out.println(stringToDouble);
		System.out.println(stringToInteger);
		
		Number numero = Integer.valueOf(5);
		double numeroDoublePrim = numero.doubleValue();
		
		Boolean falso = Boolean.FALSE;
		//Boolean falso = false;
		
	}
	

}
