package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite dois valores: ");

		System.out.println("Primeiro valor: ");
		int num1 = scan.nextInt();

		System.out.println("Segundo valor: ");
		int num2 = scan.nextInt();

		double soma = 0;
		for (int i = num1; num1 < num2; num1++) {
			soma += num1;
		}

		System.out.println("Soma: " + soma);
	}

}
