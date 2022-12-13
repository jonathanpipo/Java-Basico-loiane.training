//faca um programa que calcule a area de um quadrado e em seguida mostre o dobro para o usuario
package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um valor em metros para o lado do quadrado: ");
		
		double ladoQuadrado = scan.nextDouble();
		
		//area = lado * lado
		double areaQuadrado = Math.pow(ladoQuadrado, 2);
		
		System.out.println("A area do quadrado e: " + areaQuadrado);
		System.out.println("O dobro da a area do quadrado e: " + (areaQuadrado * 2));
		
	}

}
