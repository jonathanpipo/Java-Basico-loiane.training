package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Graus Celsius");
		double celsius = scan.nextDouble();
		
		//F = C x 1,8 + 32
		double farenheit = ((celsius * 1.8) + 32);
		System.out.println(celsius + " graus Celsius são " + farenheit + " graus Farenheit.");
	}

}
