//faca um programa que pergunte o quanto voce ganha por hora e o numero de horas trabalhadas no mes. Calcule e mostre o total do salario.
package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor ganho por hora trabalhada: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite o numero de horas trabalhadas: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double valorRecebido = valorHora * horasTrabalhadas;
		System.out.println("O valor recebi sera de: R$" + valorRecebido + " reais.");
	}

}
