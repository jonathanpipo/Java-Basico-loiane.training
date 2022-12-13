//escreva um programa que peca o raio de um circulo, calcule e mostre a area
package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio06 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um valor em metros de raio de um circulo qualquer:");
		double raio = scan.nextDouble();
		
		//calculo da area
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A area do circulo de raio " + raio + " e igual a " + area + ".");
	}
}
