package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tipo de carne: ");
		System.out.println("1 - File Duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		int tipoCarne = scan.nextInt();
		
		System.out.println("Digite a quantidade de carne: ");
		double qttCarne = scan.nextDouble();
		
		double precoKg = 0;
		
		if (tipoCarne == 1) {
			
			System.out.println(qttCarne + " kg - File Duplo");
			
			//estipular valor por kg
			if(qttCarne <= 5) {
				precoKg = 4.90;
			} else if (qttCarne > 5) {
				precoKg = 5.80;
			}
			
		} else if (tipoCarne == 2) {
			
			System.out.println(qttCarne + " kg - Alcatra");
			
			//estipular valor por kg
			if(qttCarne <= 5) {
				precoKg = 5.90;
			} else if (qttCarne > 5) {
				precoKg = 6.80;
			}
			
		} else if (tipoCarne == 3) {
			
			System.out.println(qttCarne + " kg - Picanha");
			
			//estipular valor por kg
			if(qttCarne <= 5) {
				precoKg = 6.90;
			} else if (qttCarne > 5) {
				precoKg = 7.80;
			}
			
		}
		
		double total = qttCarne * precoKg;
		
		System.out.println("Compra no cartao? 1-Sim / 2-Nao");
		int cartao = scan.nextInt();
		
		if(cartao == 1) {
			double desconto = (total / 100) * 5;
			System.out.println("Desconto de " + desconto);
			System.out.println("Valor a pagar: " + (total - desconto));
			
		} else if (cartao == 2) {
			System.out.println("Valor a pagar: " + total);
		
		} else {
			System.out.println("Opcao invalida!");
		}
		
	}
}