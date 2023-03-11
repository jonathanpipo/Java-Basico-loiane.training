package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {

		Random numRandom = new Random();

		int[][] matrizA = new int[10][10];

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				matrizA[i][j] = numRandom.nextInt(100);
			}
		}

		int linhaCinco = 5;
		int maiorColCinco = Integer.MIN_VALUE;
		int menorColCinco = Integer.MAX_VALUE;
		for (int i = 0; i < matrizA[linhaCinco].length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				if (matrizA[linhaCinco][i] < menorColCinco) {
					menorColCinco = matrizA[linhaCinco][i];
				}
				if (matrizA[linhaCinco][i] > maiorColCinco) {
					maiorColCinco = matrizA[linhaCinco][i];
				}
			}
		}
		System.out.println(menorColCinco);
		System.out.println(maiorColCinco);

		int colSete = 7;
		int maiorColSete = Integer.MIN_VALUE;
		int menorColSete = Integer.MAX_VALUE;
		for (int i = 0; i < matrizA.length; i++) {
			if (matrizA[i][colSete] < menorColSete) {
				menorColSete = matrizA[i][colSete];
			}
			if (matrizA[i][colSete] > maiorColSete) {
				maiorColSete = matrizA[i][colSete];
			}
		}
		System.out.println(menorColSete);
		System.out.println(maiorColSete);

		System.out.println();
		System.out.println("Matriz: ");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}

	}

}
