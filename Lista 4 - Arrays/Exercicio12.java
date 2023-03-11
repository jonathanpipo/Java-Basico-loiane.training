package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];
		int soma = 0;

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Posicao " + i);
			vetorA[i] = sc.nextInt();

			soma += vetorA[i];

		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("A soma dos numeros do vetor A: " + soma);

	}

}
