
public class TestGerente {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		// gerente.setSalario(5000);
		// Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
		gerente.setNombre("Jimena");
		gerente.setClave("12AB");
		gerente.setTipo(1);

		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.iniciarSecion("12AB"));
	}

}
