package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o numero de notas: ");
		int notas = scan.nextInt();

		double soma = 0;
		double media = 0;

		for (int i = 0; i < notas; i++) {
			System.out.println("Entre com a nota " + (i + 1));
			soma += scan.nextInt();
		}

		media = (soma / notas);
		System.out.println("Media: " + media);
	}

}
