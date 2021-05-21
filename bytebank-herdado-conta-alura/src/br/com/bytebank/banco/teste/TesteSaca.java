package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {

		Conta contaCorrente = new ContaCorrente(1234, 145678);
		contaCorrente.deposita(200.0);
		try {
			contaCorrente.saca(210.0);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Ex: " + e.getMessage());
		}

		System.out.println(contaCorrente.getSaldo());

	}
}
