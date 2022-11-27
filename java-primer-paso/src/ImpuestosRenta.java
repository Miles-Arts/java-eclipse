//De 1900.0 a 2800.0, el IR es de 7.5% y puede deducir de la declaración el monto de 142.
//De 2800.01 a 3751.0, el IR es del 15% y puede deducir 350.
//De 3751.01 a 4664.00, el IR es 22.5% y puede deducir 636.
public class ImpuestosRenta {

	public static void main(String[] args) {

		double salario = 4664.0;
		// ifs aqui

		if (salario >= 1900 && salario <= 2800) {
			System.out.println("El IR es de 7.5% y puede deducir de la declaración el monto de 142");

		} else if (salario >= 2800 && salario <= 3751) {
			System.out.println("El IR es del 15% y puede deducir 350.");

		} else if (salario >= 3751 && salario <= 4664) {
			System.out.println("El IR es 22.5% y puede deducir 636.");
		}
		if (salario <= 1899 || salario >= 4665) {
			System.out.println("Por favor ingresa un número dentro de los parámetros");
		}
	}
}