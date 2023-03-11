package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];

		System.out.println("Digite 10 valores: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Posicao: " + i);
			vetorA[i] = sc.nextInt();
		}

		int somaMenorQuinze = 0;
		int qntDoElemQuinze = 0;
		int qntMaiorElemQuinze = 0;
		int somaGeral = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < 15) {
				somaMenorQuinze += vetorA[i];
			} else if (vetorA[i] == 15) {
				qntDoElemQuinze++;
			} else if (vetorA[i] > 15) {
				qntMaiorElemQuinze++;
				somaGeral += vetorA[i];
			}
		}

		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.println("A soma dos elementos < que quinze: " + somaMenorQuinze);
		System.out.println("Quantidade de numeros quinze: " + qntDoElemQuinze);
		System.out.println("A media dos elementos > que quinze: " + somaGeral / qntMaiorElemQuinze);

	}

}
