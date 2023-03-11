package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Posicao: " + (i + 1));
			vetorA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Posicao: " + (i + 1));
			vetorB[i] = sc.nextInt();
		}

		for (int i = 0; i < vetorC.length; i++) {

			if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			} else if (vetorA[i] < vetorB[i]) {
				vetorC[i] = -1;
			}

		}

		System.out.println();
		System.out.println("Vetores: ");

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
