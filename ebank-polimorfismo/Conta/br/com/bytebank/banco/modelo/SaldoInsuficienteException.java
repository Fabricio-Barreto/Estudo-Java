package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends RuntimeException{ //Unchecked
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
