package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {

		Random numRandom = new Random();

		int[][] matrizA = new int[4][4];
		int maior = Integer.MIN_VALUE; // na primeira comparacao o valor sera trocado
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				matrizA[i][j] = numRandom.nextInt(100);

				if (matrizA[i][j] > maior) {
					maior = matrizA[i][j];
					linha = i;
					coluna = j;
				}
			}
		}

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("O maior elemento da matriz e: " + maior);
		System.out.println("Pertence a posicao: " + linha + "/" + coluna);

	}

}
