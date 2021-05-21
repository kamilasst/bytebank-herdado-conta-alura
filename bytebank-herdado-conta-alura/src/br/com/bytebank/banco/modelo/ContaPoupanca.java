package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero, String operacao) {
		super(agencia, numero);
	}

	/*
	 * Apesar de não chamar o super, explicitamente, o construtor da classe pai vai
	 * ser executado. Na execução o código acessa primeiro o construtor do pai e
	 * depois acessa o construtor do filho.
	 */
	public ContaPoupanca() {
		System.out.println("Construtor default Conta Poupança");
	}

	public ContaPoupanca(int numero) {
		this(0, numero, null);
	}
}
