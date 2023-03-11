package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];

		System.out.println("Digite os valores do vetor:");

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Posicao " + (i + 1));
			vetorA[i] = sc.nextInt();
		}

		System.out.println("Valores digitados: ");
		boolean primo;
		String msg;
		for (int i = 0; i < vetorA.length; i++) {

			primo = true;
			for (int j = 2; j < vetorA[i]; j++) { // todos os numeros sao divisiveis por 1
				if (vetorA[i] % j == 0) {
					primo = false;
					break;
				}
			}

			msg = "";
			if (primo) {
				msg = " - PRIMO";
			} else {
				msg = " - NAO PRIMO";
			}

			System.out.println(vetorA[i] + msg);
		}

	}

}
