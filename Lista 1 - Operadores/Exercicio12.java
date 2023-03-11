package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite sua altura para o calculo do seu peso ideal: ");

		System.out.println("Altura: ");
		double altura = scan.nextDouble();

		// calculo do peso ideal
		double pesoIdeal = (72.7 * altura) - 58;

		System.out.println("Seu peso ideal e: " + pesoIdeal);
	}

}
