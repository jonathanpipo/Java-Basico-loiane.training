package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois valores: ");
		
		System.out.println("Primeiro valor: ");
		int num1 = scan.nextInt();
		
		System.out.println("Segundo valor: ");
		int num2 = scan.nextInt();
		
		for(int i = num1; num1 < num2; num1++) {
			System.out.println(num1);
		}

	}

}
