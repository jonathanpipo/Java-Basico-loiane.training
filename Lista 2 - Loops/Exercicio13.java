package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero referente aos dias da semana: ");

		System.out.println("Numero (1-7): ");
		int dia = scan.nextInt();

		switch (dia) {
		case 1:
			System.out.println("1-Domingo");
			break;
		case 2:
			System.out.println("2-Segunda");
			break;
		case 3:
			System.out.println("3-Terca");
			break;
		case 4:
			System.out.println("4-Quarta");
			break;
		case 5:
			System.out.println("5-Quinta");
			break;
		case 6:
			System.out.println("6-Sexta");
			break;
		case 7:
			System.out.println("7-Sabado");
			break;
		default:
			System.out.println("Dia invalido.");
			break;
		}

	}

}
