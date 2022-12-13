package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite duas notas parciais do aluno: ");
		
		System.out.println("Primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Segunda nota: ");
		double nota2 = scan.nextDouble();
		
		//calculo da media
		double media = ((nota1 + nota2)/2);
		
		if(media == 10) {
			System.out.println("Aprovado com distincao!");
		} else if (media >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
	}

}
