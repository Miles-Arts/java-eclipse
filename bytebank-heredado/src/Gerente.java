//                    Extiende de
public class Gerente extends Funcionario {

	private String clave;

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean iniciarSesion(String clave) {
		return clave == "12AB";
	}

	public double getBonificacion() {
		System.out.println("Ejecuntado gerente");
		// return super.getSalario() + (super.getSalario() * 0.1);
		//return super.getSalario() + super.getBonificacion();
		return super.getSalario() + this.getSalario() * 0.05;
	}
	// lo de abajo ya esta en FUNCIONARIO

	// private String nombre;
	// private String documento;
	// private double salario;

	// public Gerente() {

	// }

	// public String getNombre() {
	// return nombre;
	// }

	// public void setNombre(String nombre) {
	// this.nombre = nombre;
	// }

	// public String getDocumento() {
	// return documento;
	// }

	// public void setDocumento(String documento) {
	// this.documento = documento;
	// }

	// public double getSalario() {
	// return salario;
	// }

	// public void setSalario(double salario) {
	// this.salario = salario;
	// }

	// public double getBonificacion() {

	// return this.salario;

	// }
}
