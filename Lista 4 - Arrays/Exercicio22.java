package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];

		int zeros = 0;
		int ums = 0;
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random()) * 1;
			if (vetorA[i] == 0) {
				zeros++;
			} else if (vetorA[i] == 1) {
				ums++;
			}
		}

		System.out.print("Vetor = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("Zeros: " + ((zeros * 100) / vetorA.length));
		System.out.println("Ums: " + ((ums * 100) / vetorA.length));
	}

}
