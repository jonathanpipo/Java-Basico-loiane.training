package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] result = new double[notas1.length];

		// registrar as notas do vetor notas1
		for (int i = 0; i < notas1.length; i++) {
			System.out.println("Nota 1 do aluno  " + (i + 1) + " :");
			notas1[i] = sc.nextDouble();

			System.out.println("Nota 2 do aluno  " + (i + 1) + " :");
			notas2[i] = sc.nextDouble();

			result[i] = (notas1[i] + notas2[i]) / 2;
		}

		// exibir resultados
		System.out.println();
		;
		System.out.println("Medias e Situacao dos alunos");
		for (int i = 0; i < result.length; i++) {
			System.out.println("Aluno " + (i + 1) + ":");
			System.out.println("Prova 1: " + notas1[i]);
			System.out.println("Prova 2: " + notas2[i]);
			System.out.println("Media " + result[i]);
			if (result[i] >= 7) {
				System.out.println("Situacao  = APROVADO");
			} else if (result[i] < 7) {
				System.out.println("Situacao = REPROVADO");
			}

			System.out.println();
		}

	}

}
