package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		do {
			System.out.println("Entre com um numero positivo: ");
			num = sc.nextInt();

			if (num < 0) {
				System.out.println("Numero invalido, digite novamente");
			}
		} while (num < 0);

		System.out.println(Fatorial.fatorial(num));
	}

}
