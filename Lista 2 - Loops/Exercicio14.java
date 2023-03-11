package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite duas notas parciais do aluno: ");

		System.out.println("Primeira nota: ");
		double nota1 = scan.nextDouble();

		System.out.println("Segunda nota: ");
		double nota2 = scan.nextDouble();

		// calculo da media
		double media = (nota1 + nota2) / 2;

		// calculo do conceito pela nota
		String conceito = "";
		if (media >= 9 && media <= 10) {
			conceito = "A";
		} else if (media >= 7.5 && media < 9) {
			conceito = "B";
		} else if (media >= 6 && media < 7.5) {
			conceito = "C";
		} else if (media >= 4 && media < 6) {
			conceito = "D";
		} else if (media >= 0 && media < 4) {
			conceito = "E";
		}

		System.out.println("As notas: " + nota1 + " e " + nota2);
		System.out.println("A media: " + media);
		System.out.println("Conceito: " + conceito);

		switch (conceito) {
		case "A":
		case "B":
		case "C":
			System.out.println("APROVADO");
			break;
		case "D":
			;
		case "E":
			;
			System.out.println("REPROVADO");
			break;
		}
	}

}
