package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe dois numeros inteiros: ");

		System.out.println("Valor 1: ");
		int valor1 = scan.nextInt();

		System.out.println("Valor 2: ");
		int valor2 = scan.nextInt();

		if (valor1 > valor2) {
			System.out.println("O maior valor e o " + valor1);
		} else if (valor1 < valor2) {
			System.out.println("O maior valor e o " + valor2);
		} else {
			System.out.println("Os valores sao iguais: " + valor1);
		}
	}

}
