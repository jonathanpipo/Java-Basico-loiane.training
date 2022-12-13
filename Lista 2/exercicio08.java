package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o preco de tres produtos: ");
		
		System.out.println("Produto 1: ");
		double item1 = scan.nextDouble();
		
		System.out.println("Produto 2: ");
		double item2 = scan.nextDouble();
		
		System.out.println("Produto 3: ");
		double item3 = scan.nextDouble();
		
		if (item1 <= item2 && item1 <= item3) {
			System.out.println("Compre o item 1, de valor " + item1);
		} else if(item2 <= item1 && item2 <= item3) {
			System.out.println("Compre o item 2, de valor " + item2);
		} else if(item3 <= item1 && item3 <= item3) {
			System.out.println("Compre o item 3, de valor " + item3);
		}
	}

}
