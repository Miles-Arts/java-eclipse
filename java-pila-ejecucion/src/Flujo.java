
public class Flujo {

	public static void main(String[] args) {
		System.out.println("Inicio del main");
		metodo1();
		System.out.println("Fin del main");
	}

	private static void metodo1() {
		System.out.println("Inicio del metodo1");
		metodo2();
		System.out.println("Fin del metodo1");
	}

	private static void metodo2() {
		System.out.println("Inicio del metodo2");
		//for (int i = 1; i <= 5; i++) {
			//System.out.println(i);

			//try { // Intenta con esto

				//if (i == 3) {

				//	int num = 0;
				//	int resultado = i / num;
				//	System.out.println(resultado);
				//}

				//String test = null;
				//System.out.println(test.toString());

			//} catch (ArithmeticException | NullPointerException exception) { // Atrapa el error
			//	System.out.println("Atrapo Excepción");
			//	System.out.println(exception.getMessage());
			//	exception.printStackTrace();
			//}
		//}
		Cuenta cuenta = new Cuenta();
		throw  new ArithmeticException();
		
		
		//System.out.println("Fin del metodo2");
	} 
}
