package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite dois valores inteiros para serem somados: ");

		System.out.println("Primeiro valor:");
		int primeiroValor = scan.nextInt();

		System.out.println("Segundo valor:");
		int segundoValor = scan.nextInt();

		int resultado = (primeiroValor + segundoValor);
		System.out.println("A soma dos numeros digitados e: " + resultado);
	}

}
