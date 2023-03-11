package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um ano: ");
		int ano = scan.nextInt();

		if (ano % 4 == 0 && ano % 100 == 0 || ano % 400 == 0) {
			System.out.println("Bissexto.");
		} else {
			System.out.println("NAO Bissexto.");
		}

	}

}
