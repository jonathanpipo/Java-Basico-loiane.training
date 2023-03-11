package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite tres valores para o calculo das raizes de segundo grau: ");

		System.out.println("Valor de A: ");
		int valorA = scan.nextInt();

		if (valorA < 0) {
			System.out.println("A equacao nao e de segundo grau");
		} else {
			System.out.println("Valor de B: ");
			int valorB = scan.nextInt();

			System.out.println("Valor de C: ");
			int valorC = scan.nextInt();

			// calculo do DELTA
			double delta = (valorB * valorB) + (-4 * (valorA * valorC));

			// calculo das RAIZES
			double x1 = ((-(valorB) + Math.sqrt(delta)) / 2 * valorA);
			double x2 = ((-(valorB) - Math.sqrt(delta)) / 2 * valorA);

			// if-else aninhado
			if (delta < 0) {
				System.out.println("Delta negativo. A equacao NAO POSSUI raizes reais ");
			} else if (delta == 0) {
				System.out.println("Delta igual a ZERO. A equacao possui UMA raiz ");
				System.out.println("Raiz X1: " + x1);
				System.out.println("Raiz X2: " + x2);
			} else if (delta > 0) {
				System.out.println("Delta maior que ZERO. A equacao possui DUAS raizes");
				System.out.println("Delta: " + delta);
				System.out.println("Raiz X1: " + x1);
				System.out.println("Raiz X2: " + x2);
			}
		}

	}

}
