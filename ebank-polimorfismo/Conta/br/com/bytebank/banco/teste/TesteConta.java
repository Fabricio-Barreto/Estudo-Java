package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.depositar(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.depositar(200);
		
		cc.transferir(33, cp);
		
		cc.sacar(10);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		ContaCorrente cc2 = new ContaCorrente(1121, 1121);
		cc2.depositar(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(cc2);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
		
		Conta conta = new ContaCorrente(123, 321);
		
		conta.depositar(200);
		try {
		conta.sacar(1900);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(conta.getSaldo());
		

	}

}
