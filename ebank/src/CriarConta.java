
public class CriarConta {
	public static void main(String[] args) {
		Conta primeiraConta = new  Conta(1337, 022040);
		
		primeiraConta.depositar(200);
		
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.sacar(20);
		
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new  Conta(1338, 022041);
		
		segundaConta.depositar(2000);
		
		System.out.println(segundaConta.getSaldo());
		
		if(segundaConta.transferir(500, primeiraConta)) {
			System.out.println("Transferencia feita com sucesso!");
		}
		
		System.out.println(primeiraConta.getSaldo());
		
		System.out.println(segundaConta.getSaldo());
		
		Cliente clienteFabricio = new Cliente();
		
		clienteFabricio.setNome("Fabricio Barreto");
		
		primeiraConta.setCliente(clienteFabricio);
		
		System.out.println(primeiraConta.getCliente().getNome());
		
		Conta.getTotalContas();
	}
}
