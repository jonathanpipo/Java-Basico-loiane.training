package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double popA;
		double popB;
		double taxaCrescA;
		double taxaCrescB;
		
		System.out.println("Digite as informacoes: ");
		
		int cont = 0;
		
		//populacao inicial de A
		boolean infoValida = false;
		do {
			System.out.println("Populacao inicial da Cidade A: ");
			popA = scan.nextDouble();
			if(popA > 0) {
				infoValida = true;
			} else {
				System.out.println("Informacao invalida!");
			}
			
		} while(!infoValida);
		
		//taxa de crescimento de A
		infoValida = false;
		do {
			System.out.println("Taxa de crescimento da Cidade A:");
			taxaCrescA = scan.nextDouble();
			if(taxaCrescA > 0) {
				infoValida = true;
			} else {
				System.out.println("Informacao invalida!");
			}
			
		} while(!infoValida);
		
		//populacao inicial de B
		infoValida = false;
		do {
			System.out.println("Populacao inicial da Cidade B: ");
			popB = scan.nextDouble();
			if(popB > 0) {
				infoValida = true;
			} else {
				System.out.println("Informacao invalida!");
			}
			
		} while(!infoValida);
		
		//taxa de crescimento de B
		infoValida = false;
		do {
			System.out.println("Taxa de crescimento da Cidade B:");
			taxaCrescB = scan.nextDouble();
			if(taxaCrescB > 0) {
				infoValida = true;
			} else {
				System.out.println("Informacao invalida!");
			}
			
		} while(!infoValida);
		
		while (popA < popB) {
			popA += (popA/100) * taxaCrescA;
			popB += (popB/100) * taxaCrescB;
			cont++;
		}
		
		System.out.println("populacao A: " + popA);
		System.out.println("Populacao B: " + popB);
		System.out.println("Anos: " + cont);

	}

}
