package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Posicao " + i);
			vetorA[i] = sc.nextInt();
		}

		int impar = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				impar++;
			}
		}

		int par = vetorA.length - impar;

		int porcPar = (par * 100) / vetorA.length;
		int porcImpar = 100 - porcPar;

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("Porcentagem pares" + porcPar);
		System.out.println("Porcentagem impares" + porcImpar);

	}

}
