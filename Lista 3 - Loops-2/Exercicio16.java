package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		// Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um n-esimo termo da serie de fibonacci");
		// int n = scan.nextInt();

		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;

		System.out.println(primeiro);
		System.out.println(segundo);

		while (proximo < 500) {

			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;

			System.out.println(proximo);
		}
	}

}
