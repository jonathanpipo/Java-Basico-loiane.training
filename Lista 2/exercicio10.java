package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Em qual periodo voce esruda? ");
		System.out.println("M-matutino");
		System.out.println("V-vespertino");
		System.out.println("N-noturno");
		
		String periodo = scan.next();
		
		switch(periodo) {
		case "m":;
		case "M": System.out.println("Bom dia!"); break;
		case "v":;
		case "V": System.out.println("Boa tarde!"); break;
		case "n":;
		case "N": System.out.println("Boa noite!"); break;
		default: System.out.println("Valor invalido");
		}
	}

}
