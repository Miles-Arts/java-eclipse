
public class Flujo {

	public static void main(String[] args) {
		System.out.println("Inicio del main");
		try {
			metodo1();
		} catch (MiException | ArithmeticException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin del main");
	}

	private static void metodo1() throws MiException {
		System.out.println("Inicio del metodo1");
		
		try {
			metodo2();
		} catch (MiException me) {
			me.printStackTrace();
		}
		
		//metodo2();
		
		System.out.println("Fin del metodo1");
	}

	private static void metodo2() throws MiException {
	//private static void metodo2() {
		System.out.println("Inicio del metodo2");
		//int a = 50/0; //Arithmetic Exception
		//Cuenta c = null;
		//c.deposita();
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
		//Cuenta cuenta = new Cuenta();
		//throw  new ArithmeticException();
		throw  new MiException("Mi excepción fue lanzada");
		
		//metodo2();
		
		
		//System.out.println("Fin del metodo2");
	} 
}
