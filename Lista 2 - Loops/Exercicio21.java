package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o volume de combustivel desejado: ");
		double volGas = scan.nextDouble();

		System.out.println("Digite o combustivel desejado:");
		System.out.println("G- Gasolina / A-Alcool:");
		String tipoGas = scan.next();

		double precoGasolina = 2.50;
		double precoAlcool = 1.90;
		double desconto = 0;
		double total = 0;
		double totalDesconto = 0;

		// descontos do alcool
		if (tipoGas.equalsIgnoreCase("A")) {

			if (volGas <= 20) {
				desconto = 3;
			} else if (volGas > 20) {
				desconto = 5;
			}

			total = (volGas * precoAlcool);
			// descontos da gasolina
		} else if (tipoGas.equalsIgnoreCase("G")) {

			if (volGas <= 20) {
				desconto = 4;
			} else if (volGas > 20) {
				desconto = 6;
			}

			total = (volGas * precoGasolina);
		}

		totalDesconto = (total / 100) * desconto;

		double totalPagar = total - totalDesconto;

		System.out.println("Total a pagar: " + totalPagar);

	}

}
