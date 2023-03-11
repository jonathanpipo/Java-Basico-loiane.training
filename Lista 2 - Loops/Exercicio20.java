package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int notaClassificacao = 0;

		System.out.println("Responda 5 perguntas com S/N: ");

		System.out.println("1 - Telefonou para a vitima?");
		String resposta1 = scan.next();
		if (resposta1.equalsIgnoreCase("S")) {
			notaClassificacao++;
		}

		System.out.println("2 - Esteve no local do crime?");
		String resposta2 = scan.next();
		if (resposta2.equalsIgnoreCase("S")) {
			notaClassificacao++;
		}

		System.out.println("3 - Mora perto da vitima?");
		String resposta3 = scan.next();
		if (resposta3.equalsIgnoreCase("S")) {
			notaClassificacao++;
		}

		System.out.println("4 - Devia algo para a vitima?");
		String resposta4 = scan.next();
		if (resposta4.equalsIgnoreCase("S")) {
			notaClassificacao++;
		}

		System.out.println("5 - Ja trabalhou para a vitima?");
		String resposta5 = scan.next();
		if (resposta5.equalsIgnoreCase("S")) {
			notaClassificacao++;
		}

		if (notaClassificacao == 2) {
			System.out.println("Suspeito - Classificacao: " + notaClassificacao);
		} else if (notaClassificacao > 2 && notaClassificacao <= 4) {
			System.out.println("Cumplice - Classificacao: " + notaClassificacao);
		} else if (notaClassificacao == 5) {
			System.out.println("Assassino - Classificacao: " + notaClassificacao);
		} else {
			System.out.println("Inocente - Classificacao: " + notaClassificacao);
		}
	}

}
