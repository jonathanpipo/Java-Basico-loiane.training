package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite tres valores - 2 inteiros e 1 real: ");
		
		System.out.println("Primeiro valor (inteiro): ");
		int valor1 = scan.nextInt();
		
		System.out.println("Segundo valor (inteiro): ");
		int valor2 = scan.nextInt();
		
		System.out.println("Terceiro valor (real): ");
		double valor3 = scan.nextDouble();
		
		//calculo de a
		int resultadoA = ((valor1 * 2)*(valor2/2));
		
		//calculo de b
		double resultadoB = ((valor1 * 3) + valor3);
		
		//calculo de c
		double resultadoC = Math.pow(valor3, 3);
		
		System.out.println("Calculos:");
		System.out.println("a: " + resultadoA);
		System.out.println("b: " + resultadoB);
		System.out.println("c: " + resultadoC);
	}

}
