package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];

		System.out.println("Digite os valores do Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Posicao " + i);
			vetorA[i] = sc.nextInt();

			vetorB[i] = Math.sqrt(vetorA[i]);
		}

		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		DecimalFormat df = new DecimalFormat("###,###.###");

		System.out.println("Vetor B = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(df.format(vetorB[i]) + " ");
		}
	}

}
