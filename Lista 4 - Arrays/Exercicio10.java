package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		System.out.println("Digite os valores do Array: ");

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A - Posicao: " + i);
			vetorA[i] = sc.nextInt();

			vetorB[i] = vetorA[i] % 2;
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A - Posicao: " + i + " - Valor " + vetorA[i]);
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Vetor B - Posicao: " + i + " - Valor " + vetorB[i]);
		}
	}

}
