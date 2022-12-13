//Faca um programa que recebe 4 notas bimestrais e imprima a media
package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quatro notas bimestrais para se obter a media: ");
		
		System.out.println("Entre com a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Entre com a terceira nota: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Entre com a quarta nota: ");
		double nota4 = scan.nextDouble();
		 
		//calcular a media
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A media e: " + media);
	}

}
