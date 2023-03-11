package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] matrizA = new int[3][3];

		System.out.println("Digite os valores da matriz: ");

		int qntPares = 0;
		int qntImpares = 0;
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.println("Posicao [" + i + "," + j + "]");
				matrizA[i][j] = sc.nextInt();

				if (matrizA[i][j] % 2 == 0) {
					qntPares++;
				} else {
					qntImpares++;
				}
			}
		}

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.print(matrizA[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Quantidade de numeros pares: " + qntPares);
		System.out.println("Quantidade de numeros impares: " + qntImpares);

	}

}
