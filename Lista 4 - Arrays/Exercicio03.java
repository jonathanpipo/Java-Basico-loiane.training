package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];

		System.out.println("Digite os valores do vetor A: ");

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Posicao " + i + ": ");
			vetorA[i] = sc.nextInt();

			vetorB[i] = vetorA[i] * vetorA[i];

		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

	}

}
