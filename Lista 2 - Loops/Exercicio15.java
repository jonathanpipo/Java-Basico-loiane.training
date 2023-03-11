package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite tres valores para um triangulo: ");

		System.out.println("Primeiro lado: ");
		int lado1 = scan.nextInt();

		System.out.println("Segundo lado: ");
		int lado2 = scan.nextInt();

		System.out.println("Terceiro lado: ");
		int lado3 = scan.nextInt();

		// testar se é triangulo ou nao
		if (((lado1 + lado2)) > lado3 || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {

			// se for um triangulo
			if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
				System.out.println("Triangulo Equilatero");
			} else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
				System.out.println("Triangulo Isosceles");
			} else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
				System.out.println("Triangulo Escaleno");
			}

			// se nao for um triangulo
		} else {
			System.out.println("Não é um triangulo.");
		}
	}

}
