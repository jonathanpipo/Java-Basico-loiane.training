package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de temperaturas: ");
		int qttTemp = sc.nextInt();
		

		double temp;
		double maiorTemp = Double.MIN_VALUE;
		double menorTemp = Double.MAX_VALUE;
		double somaTemp = 0;
		
		
		for (int i = 1; i <= qttTemp; i++) {
			System.out.print("Temperatura " + i + ": ");
			temp = sc.nextDouble();
			
			if (temp <= menorTemp) {
				menorTemp = temp;
			} 
			
			if(temp >= maiorTemp) {
				maiorTemp = temp;
			}
			
			somaTemp += temp;
		}
		
		System.out.println("Media das Temperaturas: " + (somaTemp/qttTemp));
		System.out.println("Maior Temperatura: " + maiorTemp);
		System.out.println("Menor Temperatura: " + menorTemp);

	}

}
