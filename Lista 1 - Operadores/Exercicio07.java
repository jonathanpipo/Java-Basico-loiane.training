package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um valor em metros para o lado do quadrado: ");

		double ladoQuadrado = scan.nextDouble();

		// area = lado * lado
		double areaQuadrado = Math.pow(ladoQuadrado, 2);

		System.out.println("A area do quadrado e: " + areaQuadrado);
		System.out.println("O dobro da a area do quadrado e: " + (areaQuadrado * 2));

	}

}
