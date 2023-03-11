package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[5];

		System.out.println("Digite os valores do vetor: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Posicao " + (i + 1));
			vetorA[i] = sc.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Tabuada do " + vetorA[i] + ": ");
			for (int j = 1; j <= 10; j++) {
				System.out.print("5x" + j + "=" + (vetorA[i] * j) + " ");
			}
			System.out.println();
			System.out.println();
		}

	}

}
