package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numA = new int[5];
		int[] numB = new int[numA.length];

		// inserir valores nos vetores
		for (int i = 0; i < numA.length; i++) {

			System.out.println("Entre com um valor da posicao: " + i);
			numA[i] = sc.nextInt();
			numB[i] = numA[i];
		}

		// imprimir os valores dos vetores
		System.out.println("Valores dos vetores A e B: ");
		for (int i = 0; i < numA.length; i++) {
			System.out.println("Vetor A - Posicao " + i + " - Valor " + numA[i]);
		}
		for (int i = 0; i < numB.length; i++) {
			System.out.println("Vetor B - Posicao " + i + " - Valor " + numB[i]);
		}

	}

}
