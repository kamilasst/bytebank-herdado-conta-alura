package br.com.bytebank.banco.modelo;

//Verdadeiro nome: br.com.bytebank.banco.modelo.CalculadorDeImpostos => FQN
public class CalculadorDeImposto {

	private double totalImposto;

	public void registra(Tributavel dados) {
		double valor = dados.getValorImposto();
		this.totalImposto += valor;
	}

	public double getTotalImposto() {
		return totalImposto;
	}
}
