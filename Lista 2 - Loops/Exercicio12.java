package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor hora/trabalhada e horas trabalhadas no mes: ");

		// valor hora
		System.out.println("Valor/hora: ");
		double valorHora = scan.nextDouble();

		// horas totais no mes
		System.out.println("Horas trabalhadas no mes: ");
		double horasMes = scan.nextDouble();

		double salarioBruto = valorHora * horasMes;

		// calculo do ir baseado no salario
		int percentual = 0;
		if (salarioBruto <= 900) {

		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentual = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentual = 10;
		} else if (salarioBruto > 2500) {
			percentual = 20;
		}

		double impostoRenda = (salarioBruto / 100) * percentual;
		double inss = salarioBruto * 0.10;
		double fgts = salarioBruto * 0.11; // nao desconta
		double totalDescontos = impostoRenda + inss;
		double salarioLiquido = salarioBruto - totalDescontos;

		System.out.println("Salario bruto (" + valorHora + " * " + horasMes + "): R$  " + salarioBruto);
		System.out.println("(-) IR (" + percentual + "%): R$ " + impostoRenda);
		System.out.println("(-) INSS (10%): R$ " + inss);
		System.out.println("FGTS (11%): R$ " + fgts);
		System.out.println("Total descontos: R$ " + totalDescontos);
		System.out.println("Salario liquido: R$ " + salarioLiquido);
	}

}
