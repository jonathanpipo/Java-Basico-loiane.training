//informe um numero e exiba na tela
package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numeroDigitado = scan.nextInt();
		System.out.println("O numero digitado foi: " + numeroDigitado);
	}

}
