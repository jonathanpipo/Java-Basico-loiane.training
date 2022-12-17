package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
	System.out.println("Digite dois valores: ");
	
	System.out.println("Primeiro valor: ");
	int num1 = scan.nextInt();
	
	System.out.println("Segundo valor: ");
	int num2 = scan.nextInt();
	
	int resultado = num1;
	for(int i = 1; i < num2; i++) {
		resultado *= num1;
	}
	
	System.out.println("Resultado: " + resultado);
	
	}

}
