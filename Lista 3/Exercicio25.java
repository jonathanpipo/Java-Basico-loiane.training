package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lojas Tabajara");
		
		boolean sair = false;
		String continuarCompra;
		String output;
		int qttProdutos;
		double preco;
		double total;
		double valorPago;
		double troco;
		
		
		double somaProdutos = 0;
		
		do {
	
			System.out.println("Deseja informar uma nova compra? S/N");
			continuarCompra = sc.next();
			
			if(continuarCompra.equalsIgnoreCase("s")) {
				
				output = "Lojas Tabajara\n";
				
				System.out.println("Digite a quantidade de produtos da compra:");
				qttProdutos = sc.nextInt();
				
				total = 0;
				
				for(int i = 1; i<=qttProdutos; i++) {
					System.out.print("Entre com o preco do produto " + i + " - R$: ");
					preco = sc.nextDouble();
					
					total += preco;
					
					output += "Produto " + i + " : R$ " + preco + "\n";

				}
				
				output += "Total: R$ " + total;
				
				System.out.println("Total: R$ " + total);
				 
				System.out.println("Entre com o valor pago: ");
				valorPago = sc.nextDouble();
				
				output += "Dinheiro: R$ " + valorPago + "\n";
				
				troco = total - valorPago;
				
				output += "Troco: R$ " + troco;
				System.out.println(output);
				
			} else { 
				
				sair = true; 
				
				}
			
		} while(!sair);
		

	}

}
