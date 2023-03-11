package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade em kg's de macas e morangos adquiridas: ");

		System.out.println("Maca - Quantidade em kg: ");
		double pesoMaca = scan.nextDouble();

		System.out.println("Morango - Quantidade em kg:");
		double pesoMorango = scan.nextDouble();

		// preco do peso da maca
		double precoMaca = 0;
		if (pesoMaca <= 5) {
			precoMaca = 1.80;
		} else if (pesoMaca > 5) {
			precoMaca = 1.50;
		}
		double valorMaca = pesoMaca * precoMaca;
		System.out.println("Maca - valor = " + valorMaca);

		// preco do peso do morango
		double precoMorango = 0;
		if (pesoMorango <= 5) {
			precoMorango = 2.50;
		} else if (pesoMaca > 5) {
			precoMorango = 2.20;
		}
		double valorMorango = pesoMorango * precoMorango;
		System.out.println("Morango - valor = " + valorMorango);

		// acima de 8 kg OU acima de 25 reais = desconto de 10 sobre total
		double precoTotal = valorMaca + valorMorango;
		double valorPagamento = 0;
		double valorDesconto = 0;

		if ((pesoMaca + pesoMorango) > 8 || precoTotal > 25) {
			valorDesconto = (precoTotal / 100) * 10;
			valorPagamento = precoTotal - valorDesconto;
			System.out.println("Valor total R$: " + valorPagamento);
		} else {
			System.out.println("Valor total R$: " + precoTotal);
		}
	}

}
