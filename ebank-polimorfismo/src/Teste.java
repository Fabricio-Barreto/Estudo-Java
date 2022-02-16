
public class Teste {

	public static void main(String[] args) {
		
		Atentende fabricio = new Atentende();
		fabricio.setNome("Fabricio Barreto");
		fabricio.setCpf("000.000.000-00");
		fabricio.setSalario(2000);
		
		System.out.println(fabricio.getNome());
		System.out.println(fabricio.getBonificacao());
		
		Gerente fernando = new Gerente();
		fernando.setNome("Fernando");
		fernando.setSalario(5000);
		
		System.out.println(fernando.getNome());
		System.out.println(fernando.getBonificacao());
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registraBonificacao(fernando);
		controle.registraBonificacao(fabricio);
		System.out.println(controle.getSoma());
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		
		si.auth(g);
		
	}

}
