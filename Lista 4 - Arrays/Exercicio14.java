package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Posicao " + i);
			vetorA[i] = sc.nextInt();
		}

		int soma = 0;
		int impar = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				impar++;
			}
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("Quantidade de numeros impares: " + impar);
		System.out.println("Soma dos numeros impares: " + soma);
		System.out.println("Media dos numeros impares: " + (soma / impar));

	}

}
