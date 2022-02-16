
public class Administrador extends Funcionario implements Autenticavel {
	private AutenticacaoUtil autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		return 2000;
	}	
	
	public boolean auth(int senha) {
		return this.autenticador.auth(senha);
	}  

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}
	
}
