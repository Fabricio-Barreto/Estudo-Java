
public class Gerente extends Funcionario implements Autenticavel{
	private AutenticacaoUtil autenticador;
	
	public double getBonificacao() {
		//return super.getBonificacao() + super.salario;
		return super.getSalario();
	}	
	
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public boolean auth(int senha) {
		return this.autenticador.auth(senha);
	}  

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}
		
}
