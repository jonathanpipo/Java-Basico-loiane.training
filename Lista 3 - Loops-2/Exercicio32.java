package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int codigo, qnt;
		double total = 0;
		String output = "";

		boolean naoTerminar = true;

		do {

			System.out.println("Digite o codigo e a quantidade. Digite 0 0 para sair.");
			codigo = sc.nextInt();
			qnt = sc.nextInt();

			if (codigo == 0 && qnt == 0) {
				naoTerminar = false;
				output += "Total a pagar = " + total;

			} else {

				if (codigo == 100) {
					output += "Cachorro Quente -> R$ 1,20 " + qnt;
					output += " = " + (1.2 * qnt) + "\n";
					total += 1.2 * qnt;

				} else if (codigo == 101) {
					output += "Bauru Simples -> R$ 1,30 " + qnt;
					output += " = " + (1.3 * qnt) + "\n";
					total += 1.3 * qnt;

				} else if (codigo == 102) {
					output += "Bauru com Ovo -> R$ 1,50 " + qnt;
					output += " = " + (1.5 * qnt) + "\n";
					total += 1.5 * qnt;

				} else if (codigo == 103) {
					output += "Hamburguer -> R$ 1,20 " + qnt;
					output += " = " + (1.2 * qnt) + "\n";
					total += 1.2 * qnt;

				} else if (codigo == 104) {
					output += "Cheese Burguer -> R$ 1,30 " + qnt;
					output += " = " + (1.3 * qnt) + "\n";
					total += 1.3 * qnt;

				} else if (codigo == 105) {
					output += "Refrigerante -> R$ 1,00 " + qnt;
					output += " = " + (1.0 * qnt) + "\n";
					total += 1.0 * qnt;
				}
			}

		} while (naoTerminar);

		System.out.println(output);

	}

}
