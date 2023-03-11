package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[20];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Posicao " + i);
			vetorA[i] = sc.nextInt();

			vetorC[i] = vetorA[i];
		}

		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Posicao " + i);
			vetorB[i] = sc.nextInt();

			vetorC[vetorA.length + i] = vetorB[i];
		}

		System.out.println();
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

		System.out.println();
		System.out.print("Vetor C = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
	}

}
