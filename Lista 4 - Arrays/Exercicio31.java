package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];

		System.out.println("Digite os valores do vetor A: ");

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Posicao " + (i + 1));
			vetorA[i] = sc.nextInt();
		}

		int posB = 0;
		for (int i = 0; i < vetorA.length; i++) {

			if (vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}

		}
		;

		for (int i = 0; i < vetorA.length; i++) {

			if (vetorA[i] % 2 != 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}

		}
		;

		System.out.println();
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		;

		System.out.println();
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		;

	}

}
