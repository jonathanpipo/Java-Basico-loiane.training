package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];

		System.out.println("Digite 10 valores do vetor: ");

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Posicao " + (i + 1));
			vetorA[i] = sc.nextInt();
		}

		boolean palindromo = true;
		for (int i = 0; i < (vetorA.length / 2); i++) {

			if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				palindromo = false;
				break;
			}
		}

		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		if (palindromo) {
			System.out.println("Palindromo");
		} else {
			System.out.println("Nao palindromo");
		}
	}

}
