public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private ClienteBanco titular;
	private static int totalDeContas;
	
	public Conta(int agencia, int numero) {
		Conta.totalDeContas++;
		
		if(agencia > 0) {
			this.agencia = agencia;
		} else {
			this.agencia = 0;
		}
		
		if(numero > 0) {
			this.numero = numero;
		} else {
			this.numero = 0;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public static void getTotalContas() {
		System.out.println("O total de contas é " + Conta.totalDeContas);
	}
	
	public void setCliente(ClienteBanco cliente) {
		this.titular = cliente;
	}
	
	public ClienteBanco getCliente() {
		return this.titular;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}		
		return false;
	}
	
	public boolean transferir(double valor, Conta destino) {
		if(this.saldo >= valor) {
			destino.depositar(valor);
			this.saldo -= valor;
			return true;
		}	
		return false;
	}
	
}