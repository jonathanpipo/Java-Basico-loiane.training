package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int num = sc.nextInt();
		
		System.out.println("Fatorial de " + num);
		
		int fatorial = 1;
		for(int i = num; i > 1; i--) {
			fatorial *= i;
			System.out.print(i + " . ");
		}
		
		System.out.print("1 = " + fatorial);
		
	}

}
