
public class SistemaInterno {

	private int senha = 2222;
	
	public void auth(Autenticavel fa) {
		boolean autenticou = fa.auth(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}
	}
	
}
