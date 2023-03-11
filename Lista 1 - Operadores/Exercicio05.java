package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor em metros: ");
		double valorMetros = scan.nextDouble();

		// 1cm = 100m
		double valorCentimetros = (valorMetros * 100);

		System.out.println(valorMetros + " m e igual a " + valorCentimetros + " cm");

	}

}
