package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Kamila
 *
 */

public abstract class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

//  Static significa que � da classe e n�o de cada objeto criado
//  Rotina de inicializa��o. Executado uma �nica vez, quando constroi esse objeto
//	O construtor � um m�todo especial, respons�vel por construir o objeto
//  O construtor pode receber par�metros

	public Conta() {
		System.out.println("Construtor default Conta");
	}

	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("O total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("Criando uma conta " + this.numero);
	}

	public void deposita(double valor) {
		this.saldo += valor; // this � a conta a qual estou invocando(esta conta)
	}

	public void saca(double valor) throws SaldoInsuficienteException {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);

	}

	// M�todos de leitura dos atributos, os getters.
	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	// M�todos de modifica��o dos atributos, os setters. E, normalmente, s�o void.
	public void setNumero(int numero) {

		if (numero <= 0) {
			System.out.println("N�o pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {

		if (agencia <= 0) {
			System.out.println("N�o pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public String toString() {
		return " N�mero: " + this.numero + ", Ag�ncia: " + this.agencia;
	}
}
