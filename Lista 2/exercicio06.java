package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite tres numeros inteiros: ");
		
		System.out.println("Entre com o primeiro numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro numero: ");
		int num3 = scan.nextInt();
		
		if(num1>=num2 && num1>=num3) {
			System.out.println("O numero " + num1 + " e o maior entre eles.");
		} else if (num2>=num1 && num2>=num3) {
			System.out.println("O numero " + num2 + " e o maior entre eles.");
		} else if (num3>=num1 && num3>=num2){
			System.out.println("O numero " + num3 + " e o maior entre eles.");
		} else {
			System.out.println("O numero " + num3 + " e o maior entre eles.");
		}
	}

}
