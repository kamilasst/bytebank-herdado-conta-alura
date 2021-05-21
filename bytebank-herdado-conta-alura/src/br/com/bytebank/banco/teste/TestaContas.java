package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TestaContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		/*
		 * O verdadeiro nome completo se chama br.com.bytebank.banco.teste. Tbm chamado
		 * de Full Qualified Name - FQN (Nome do pacote junto com o nome da classe -
		 * conta corrente). O nome simples é ContaCorrente.
		 */
		ContaCorrente contacorrente = new ContaCorrente(2222, 121212);
		contacorrente.deposita(100.0);

		ContaPoupanca contaPoupanca = new ContaPoupanca(1111, 343434, "012");
		contaPoupanca.deposita(200.0);

		contacorrente.transfere(10.0, contaPoupanca);

		System.out.println("Conta Corrente: " + contacorrente.getSaldo());
		System.out.println("Conta Poupanca: " + contaPoupanca.getSaldo());

	}
}
