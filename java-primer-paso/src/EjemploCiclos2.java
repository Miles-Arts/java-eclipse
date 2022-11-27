
public class EjemploCiclos2 {
	
	public static void main(String[] args) {

		int contador = 0;
		int total = 0;

		while (contador <= 10) {
		
			total = total + contador;
			
			//System.out.println(total); //Print dentro muestra suma 1 x 1
			contador++;
		}
		System.out.println(total); //Print total afuera da el resultado
	}
}
