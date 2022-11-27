
public class EjemploCiclos {
	public static void main(String[] args) {

		int contador = 0;
		int contador1 = 10;

		//while(contador <= 10) {
		while (contador <= 10 || contador1 <= 20) {
			System.out.println(contador);
			
			//contador = contador + 1;
			//contador += 1;
			contador ++;
			contador1 ++;
			
		}

		System.out.println("Ciclo terminado");
	}
}
