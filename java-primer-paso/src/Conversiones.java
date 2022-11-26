
public class Conversiones {

	public static void main(String[] args) {
		
		//int 32 bit
		//double
		//long  64 bit  Numeros grandes
		//short soporta números muy pequeños
		// byte  número de 8 bit de tamaño  
		//float similar a double pero recibe números mas pequeños
		//CAST 0 castear el resultado, Pasar de float o double a ENTERO
		double variable1 = 230.89;
		int variableEntero = (int)variable1; //Metodo = cast (int) pasar de un double a in INT
		
		System.out.println(variableEntero);
	
		long prueba = 1222222222222222222L;
		
		System.out.println(prueba);
		
		short numeroPequeno = 13555;
		System.out.println(numeroPequeno);
		
		byte numeroAunMasPequeno = 15;
		System.out.println(numeroAunMasPequeno);
		
		float numeroDecimalPequeño = 2.5F;
		System.out.println(numeroDecimalPequeño);
		
		int resultado = (int)variable1 + variableEntero;
		System.out.println(resultado);
	
	}	
}
