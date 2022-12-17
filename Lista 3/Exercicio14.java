package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 10 valores inteiros: ");
		
		int par = 0;
		int impar = 0;
		int num;
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Digite o valor: ");
			num = scan.nextInt();
			
			if(num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			
		}
		
		System.out.println(par + " valores pares.");
		System.out.println(impar + " valores impares.");

	}

}
