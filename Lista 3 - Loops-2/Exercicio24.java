package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de uma unidade de pao: ");
		double valorPao = sc.nextDouble();

		System.out.println("Preco do pao: R$ " + valorPao);
		System.out.println("Panificadora Quase Dois - Tabela de Precos: ");

		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " + (i * valorPao));
		}

	}

}
