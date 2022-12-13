package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		
		double valor = scan.nextDouble();
		
		if(valor >= 0) {
			System.out.println("O valor " + valor + " e positivo.");
		} else {
			System.out.println("O valor " + valor + " e negativo.");
		} 
	}

}
