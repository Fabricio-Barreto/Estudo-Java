
public class ClienteBanco implements Autenticavel {
	private AutenticacaoUtil autenticador;
	
	public ClienteBanco() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public boolean auth(int senha) {
		return this.autenticador.auth(senha);
	}  

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}
	
}
