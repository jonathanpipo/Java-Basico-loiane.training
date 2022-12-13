package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite tres numeros inteiros: ");
		
		System.out.println("Primeiro valor: ");
		int num1 = scan.nextInt();
		
		System.out.println("Segundo valor: ");
		int num2 = scan.nextInt();
		
		System.out.println("Terceiro valor: ");
		int num3 = scan.nextInt();

		int maior = 0;
		int menor = 0;
		
		//procurando o maior
		if(num1>=num2 && num1>=num3) {
			maior = num1;
		} else if (num2>=num1 && num2>=num3) {
			maior = num2;
		} else if (num3>=num1 && num3>=num2){
			maior = num3;
		} 
		
		//procurando o menor
		if(num1<=num2 && num1<=num3) {
			menor = num1;
		} else if (num2<=num1 && num2<=num3) {
			menor = num2;
		} else if (num3<=num1 && num3<=num2){
			menor = num3;
		} 
		
		System.out.println("O menor numero: " + menor);
		System.out.println("O maior numero: " + maior);
	}

}
