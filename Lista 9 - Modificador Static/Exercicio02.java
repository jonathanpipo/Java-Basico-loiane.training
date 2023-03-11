package com.loiane.cursojava.aula34.labs;

public class Exercicio02 {

	public static void main(String[] args) {

		imprimirTela(Calculadora.soma(1, 5));

		imprimirTela(Calculadora.subtrair(2, 6));

		imprimirTela(Calculadora.multiplicar(3, 3));

		imprimirTela(Calculadora.dividir(9, 3));

	}

	static void imprimirTela(int num) {
		System.out.println(num);
	}

}
