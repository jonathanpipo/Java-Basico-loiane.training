package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o numero de CDs");
		int numCDs = sc.nextInt();

		double somaValorCD = 0;
		double mediaValorCD = 0;
		for (int i = 1; i <= numCDs; i++) {
			System.out.println("Valor do CD " + i);
			double valorCD = sc.nextDouble();

			somaValorCD += valorCD;
		}

		mediaValorCD = somaValorCD / numCDs;
		System.out.println("O valor media dos CDs e: " + mediaValorCD);

	}

}
