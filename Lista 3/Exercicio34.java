package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		System.out.println("Digite o valor de n: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			soma += 1/i;
		}
		
		System.out.println("Soma = " + soma);
	}

}
