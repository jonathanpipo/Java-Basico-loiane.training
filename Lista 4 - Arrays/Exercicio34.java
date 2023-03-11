package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];

		System.out.println("Digite os valores do vetior: ");

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Posicao " + (i + 1));
			vetorA[i] = sc.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Analizando o numero " + vetorA[i]);

			for (int j = 2; j < vetorA[i]; j++) {

				if (j % 2 == 0) {
					System.out.println(j + " e par");
				}
			}

			System.out.println();
		}
	}

}
