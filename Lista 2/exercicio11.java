package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salario atual do colaborador: ");
		
		System.out.println("Salario atual: ");
		double salarioBase = scan.nextDouble();
		int percentual = 0;
		
		//calculando reajustes
		//20%
		if(salarioBase <= 280) {
			percentual = 20;
		//15%	
		} else if (salarioBase > 280 && salarioBase <= 700) {
			percentual = 15;
		//10%	
		} else if (salarioBase > 700 && salarioBase <= 1500) {
			percentual = 10;
		//5%
		} else if (salarioBase > 1500) {
			percentual = 5;
		}
		
		double aumento = (salarioBase / 100) * percentual;
		double salarioReajustado = salarioBase + aumento;
		
		System.out.println("Salario base: R$" + salarioBase);
		System.out.println("Percentual de aumento: " + percentual + "%");
		System.out.println("Aumento de: R$" + aumento);
		System.out.println("Salario ajustado: R$" + salarioReajustado);
	}

}
