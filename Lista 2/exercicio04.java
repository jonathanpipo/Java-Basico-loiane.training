package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra do alfabeto: ");
		
		String letra = scan.next();
		
		if(letra.length()>1) {
			System.out.println("Numero de letras invalido! ");
		}else {
			switch (letra) {
			case "a":;
			case "A":;
			case "e":;
			case "E":;
			case "i":;
			case "I":;
			case "o":;
			case "O":;
			case "u":;
			case "U": System.out.println("Vogal"); break;
			default: System.out.println("Consoante"); break;
			}
		}
		
	}

}

