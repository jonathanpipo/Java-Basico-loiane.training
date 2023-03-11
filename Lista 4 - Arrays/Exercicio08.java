package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A - Posicao: " + i);
			vetorA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("B - Posicao: " + i);
			vetorB[i] = sc.nextInt();
		}

		System.out.println("Valores do vetor C: ");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
			System.out.println("C - Posicao: " + i);
			System.out.println("A * B = " + vetorA[i] + " * " + vetorB[i] + " = " + vetorC[i]);
		}
	}

}
