package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];

		System.out.println("Digite a idade da pessoa: ");

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Pessoa (" + (i + 1) + " / 10):");
			vetorA[i] = sc.nextInt();
		}

		int qntIdade = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] >= 35) {
				qntIdade++;
			}
		}

		System.out.println();
		System.out.println("O numero de pessoas que tem mais de 35 anos: " + qntIdade);

	}

}
