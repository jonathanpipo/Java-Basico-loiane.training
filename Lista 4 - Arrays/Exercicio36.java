package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] vetorA = new double[11];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Posicao " + (i + 1));
			vetorA[i] = Math.pow(2, i);
		}

		System.out.println();
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		;

	}

}
