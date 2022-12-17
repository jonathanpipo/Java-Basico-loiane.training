package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero para ver sua tabuada: ");
		int num = scan.nextInt();
		
		System.out.println("Tabuada do: " + num);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	

	}

}
