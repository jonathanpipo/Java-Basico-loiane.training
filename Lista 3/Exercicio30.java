package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor da tabuada: ");
		int numTab = sc.nextInt();
		
		System.out.println("Montar a tabuada de: " + numTab);
		
		boolean invalido = false;
		int inicioTab, fimTab;
		
		do {
			
			System.out.print("Comecar por: ");
			inicioTab = sc.nextInt();
				
			System.out.print("Terminar com: ");
			fimTab = sc.nextInt();

			if(fimTab > inicioTab) {
				invalido = true;
			}
			
		} while(!invalido);
		
		
		System.out.println("Vou montar a tabuada do " + numTab + " comecando com " + inicioTab + " e terminando com " + fimTab + ".");
		for(int i=inicioTab; i<=fimTab;i++) {
			System.out.println(numTab + " X " + i + " = " + (numTab*i));
		}
		

	}

}
