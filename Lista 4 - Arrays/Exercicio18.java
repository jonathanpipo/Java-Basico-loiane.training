package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] idades = new int[10];

		System.out.println("Digite a idade do grupo de pessoas: ");

		for (int i = 0; i < idades.length; i++) {
			System.out.println("Pessoa (" + (i + 1) + "/10): ");
			idades[i] = sc.nextInt();
		}

		int menor = idades[0];
		int indexMenor = 0;
		int maior = idades[0];
		int indexMaior = idades[0];
		for (int i = 1; i < idades.length; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				indexMaior = i;
			} else if (idades[i] < menor) {
				menor = idades[i];
				indexMenor = i;
			}
		}

		System.out.println("Vetor das idades = ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + " ");
		}

		System.out.println();
		System.out.println("Menor idade = " + menor);
		System.out.println("Indice da menor idade = " + indexMenor);
		System.out.println("Maior idade = " + maior);
		System.out.println("Indice da maior idade = " + indexMaior);
	}

}
