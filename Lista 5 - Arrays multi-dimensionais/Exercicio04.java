package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[][] compromissos = new String[31][24];

		boolean sair = false;
		int opcao;
		while (!sair) {

			System.out.println();
			System.out.println("Opcoes: ");
			System.out.println("1 - Adicionar compromisso");
			System.out.println("2 - Verificar compromisso");
			System.out.println("0 - Sair");

			opcao = sc.nextInt();

			if (opcao == 1) { // add compromisso

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mes: ");
					dia = sc.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia invalido, digite novamente.");
					}
				}

				boolean horaValido = false;
				int hora = 0;
				while (!horaValido) {
					System.out.println("Entre com a hora do dia: ");
					hora = sc.nextInt();

					if (hora >= 0 && hora <= 31) {
						horaValido = true;
					} else {
						System.out.println("Hora invalido, digite novamente.");
					}
				}

				System.out.println("Digite o compromisso");
				compromissos[--dia][hora] = sc.next(); // decremento - corrigir valor e indice da matriz

			} else if (opcao == 2) { // verificar compromisso

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mes: ");
					dia = sc.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia invalido, digite novamente.");
					}
				}

				boolean horaValido = false;
				int hora = 0;
				while (!horaValido) {
					System.out.println("Entre com a hora do dia: ");
					hora = sc.nextInt();

					if (hora >= 0 && hora <= 31) {
						horaValido = true;
					} else {
						System.out.println("Hora invalido, digite novamente.");
					}
				}

				System.out.println("O compromisso agendado e: ");
				System.out.println(compromissos[--dia][hora]);

			} else if (opcao == 0) { // sair
				sair = true;
			} else {
				System.out.println("Opcao invalida, digite novamente.");
			}
		}
	}
}