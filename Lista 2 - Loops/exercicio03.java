package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Selecione 'F' ou 'M':");

		String input = scan.next();

		if (input.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
		} else if (input.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo invalido!");
		}

	}

}
