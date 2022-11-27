
public class EjemploCondicionales2 {

	public static void main(String[] args) {

		// System.out.println("Mejoro mi Programación");

		System.out.println("Hola ");

		int edadPersona = 21;
		int cantidadPersonas = 2;

		// Boolean true
		// Boolean false

		//boolean esPareja = true;
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edadPersona >= 18 && esPareja;
		
		System.out.println("El valor de la condición es: " 
		+ esPareja);

		// if (edadPersona >= 18 || cantidadPersonas >= 2) {
		// if (edadPersona >= 18 && cantidadPersonas >= 2) {
		//if (edadPersona >= 18 && esPareja) {
		if (puedeEntrar) {

			System.out.println("Puedes ingresar a mi fiesta");

		} else {
			System.out.println("No puede ingresar a la fiesta");
		}
	} 
}