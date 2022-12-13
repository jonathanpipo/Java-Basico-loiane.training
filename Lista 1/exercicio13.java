package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor/hora trabalhada e o total de horas trabalhadas no mes: ");
		System.out.println("Valor por hora trabalhada: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Horas trabalhadas no mes: ");
		double horasTrabalhadas = scan.nextDouble();
		
		//calculo salario bruto
		double salarioBruto = valorHora * horasTrabalhadas;
		
		//calculo I.R
		double impostoRenda = salarioBruto * 0.11;
		
		//calculo do INSS
		double inss = salarioBruto * 0.08;
		
		//calculo do sindicato
		double sindicato = salarioBruto * 0.05;
		
		//total do desconto
		double desconto = impostoRenda + inss + sindicato;
		//calculo salario liquido
		double salarioLiquido = salarioBruto - desconto;
		
		System.out.println("Dados: ");
		System.out.println("Salario bruto: " + salarioBruto);
		System.out.println("Desconto do I.R: " + impostoRenda);
		System.out.println("Desconto do INSS: " + inss);
		System.out.println("Desconto do sindicato: " + sindicato);
		System.out.println("Salario liquido: " + salarioLiquido);
		
		
		

	}

}
