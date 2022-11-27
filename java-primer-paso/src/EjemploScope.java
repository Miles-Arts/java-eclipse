public class EjemploScope {

	public static void main(String[] args) {

		int edadPersona = 21;
		int cantidadPersonas = 2;

		boolean esPareja = cantidadPersonas > 1;

		if (cantidadPersonas > 1) {
			esPareja = true;
		} else {
			esPareja = false;
		}

		boolean puedeEntrar = edadPersona >= 18 && esPareja;

		System.out.println("El valor de la condición es: " + esPareja);

		if (puedeEntrar) {

			System.out.println("Puedes ingresar a mi fiesta");

		} else {
			System.out.println("No puede ingresar a la fiesta");
		}
	}
}
