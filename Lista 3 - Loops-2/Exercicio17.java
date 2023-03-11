package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um numero inteiro: ");
		int num = scan.nextInt();

		int fatorial = 1;
		for (int i = num; i > 0; i--) {
			fatorial *= i;
			System.out.println(i);
		}

		System.out.println("O fatorial e: " + fatorial);
	}

}
