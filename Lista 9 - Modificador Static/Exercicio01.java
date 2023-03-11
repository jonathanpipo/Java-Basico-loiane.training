package com.loiane.cursojava.aula34.labs;

public class Exercicio01 {

	static void imprimirValor() {
		System.out.println(Contador.obterValor());
	}

	public static void main(String[] args) {

		imprimirValor();

		Contador.incrementar();

		imprimirValor();

		Contador.zerar();

		imprimirValor();

	}

}
