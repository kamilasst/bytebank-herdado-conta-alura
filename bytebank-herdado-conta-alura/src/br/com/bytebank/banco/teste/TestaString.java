package br.com.bytebank.banco.teste;

public class TestaString {

	public static void main(String[] args) {

		String vazio = " ";
		String outroVazio = vazio.trim(); // Retira os vazios

		System.out.println(vazio.isEmpty()); // Informa se está vazio

		String nome = "Alura"; // object literal

		char caracter = nome.charAt(2); // Imprime o caracter de determinada posição
		System.out.println(caracter);

		System.out.println(nome.length()); // Informa o tamanho

		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

//		String segundoNome = nome.replace("A", "a");
//
//		String terceiroNome = nome.toUpperCase();
//
//		System.out.println(nome);
//		System.out.println(segundoNome);
//		System.out.println(terceiroNome);
//
//		int pos = nome.indexOf("Alura");
//		System.out.println(pos);
//
//		int pos2 = nome.indexOf("ura");
//		System.out.println(pos2);
//
//		int pos3 = nome.indexOf("u");
//		System.out.println(pos3);

//		String nome = "Alura";
//
//		String sub = nome.substring(1);
//		System.out.println(sub);
	}

}
