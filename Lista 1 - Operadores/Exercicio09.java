package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a temperatura em Graus Farenheit");
		double farenheit = scan.nextDouble();

		// C=(5*(F-39) / 9)
		double celsius = (5 * (farenheit - 32) / 9);
		System.out.println(farenheit + " graus Farenheit são " + celsius + " graus Celsius.");

	}

}
