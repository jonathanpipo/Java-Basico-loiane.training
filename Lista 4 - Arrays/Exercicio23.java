package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];
		boolean continua = true;

		System.out.println("Digite 10 valores: ");

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Posicao " + (i + 1));
			vetorA[i] = sc.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				System.out.println("O primeiro impar: " + vetorA[i] + " na posicao " + (i + 1));
				break;
			}
		}

	}

}
