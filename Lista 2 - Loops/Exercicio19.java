package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite dois numeros e uma operacao artimetica basica: ");

		System.out.println("Primeiro numero: ");
		double num1 = scan.nextDouble();

		System.out.println("Segundo numero: ");
		double num2 = scan.nextDouble();

		System.out.println("Operacao: '+', '-', '/', '*'");
		String operacao = scan.next();

		double resultado = 0;
		boolean valida = true;

		// calculo da operacao com os valores
		switch (operacao) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		default:
			System.out.println("Operacao invalida!");
			valida = false;
			break;
		}

		// operacao valida
		if (valida) {

			System.out.println("Resultado: " + resultado);

			if (resultado >= 0) {
				System.out.println("Resultado positivo");
			} else {
				System.out.println("Resultado negativo");
			}

			if (resultado % 2 == 0) {
				System.out.println("Resultado par");
			} else {
				System.out.println("Resultado impar");
			}
		}
	}
}
