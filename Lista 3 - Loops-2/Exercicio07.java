package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite 5 numeros: ");

		int num;
		int maior = Integer.MIN_VALUE;
		for (int i = 0; i < 5; i++) {

			System.out.println("Entre com um numero: ");
			num = scan.nextInt();

			if (num > maior) {
				maior = num;
			}
		}

		System.out.println("O maior numero digitado foi: " + maior);
	}

}
