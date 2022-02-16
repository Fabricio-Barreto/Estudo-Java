
public class ControleBonificacao {
	private double soma;
	
	public double getSoma() {
		return soma;
	}
	
	// Aqui ocorre o polimorfismo.
	public void registraBonificacao(Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao();
		this.soma = this.soma + bonificacao;
	}
}
