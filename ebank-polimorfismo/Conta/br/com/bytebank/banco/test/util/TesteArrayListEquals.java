package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;


public class TesteArrayListEquals {
	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        System.out.println(lista.size());
        
        //Conta ref = (Conta) lista.get(0);
        Conta ref = lista.get(0);
        
        System.out.println(ref.getNumero());
        
        for(Object oRef : lista) {
        	System.out.println(oRef);
        }
        
        boolean existe = lista.contains(cc2);
        
        System.out.println(existe);
		
	}
	
}
