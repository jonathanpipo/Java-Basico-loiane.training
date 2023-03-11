package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o numero de pessoas: ");
		int numPessoas = scan.nextInt();

		double somaIdade = 0;
		double media = 0;
		int idade;
		for (int i = 0; i < numPessoas; i++) {
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			somaIdade += idade;
		}

		media = somaIdade / numPessoas;

		if (media > 0 && media <= 25) {
			System.out.println("Jovem");
		} else if (media > 25 && media <= 60) {
			System.out.println("Adulta");
		} else if (media > 60) {
			System.out.println("Idosa");
		}

	}

}
