package test;
public class TestGerente {

	public static void main(String[] args) {

		// package + classname
		modelo.Gerente gerente = new modelo.Gerente();
		// gerente.setSalario(5000);
		// Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
		gerente.setNombre("Jimena");
		gerente.setClave("12AB");
		gerente.setTipo(1);

		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.iniciarSesion("12AB"));
	}

}
