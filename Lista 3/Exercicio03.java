package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome;
		String genero;
		String estadoCivil;
		int idade;
		double salario;
		
		//nome de usuario
		do {
			System.out.println("Digite o nome de usuario: ");
			nome = scan.next();
			
			if(nome.length() >= 3) {
				infoValida = true;
				System.out.println("Nome de usuario: OK -" + nome);
			} else {
				System.out.println("Nome de usuario precisa de no minimo 3 caracteres.");
			}
			
		} while(!infoValida);
		
		infoValida = false;
		//idade
		do {
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			
			if(idade >= 0 && idade <=150) {
				infoValida = true;
			} else {
				System.out.println("A idade precisa ser entre 0 e 150");
			}
			
		} while(!infoValida);

		infoValida = false;
		//salario
		do {
			salario = scan.nextDouble();
			
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salario precisa ser maior que zero");
			}
		} while(!infoValida);
		
		infoValida = false;
		//genero
		do {
			System.out.println("Digite seu genero: ");
			genero = scan.next();
			
			if (genero.equalsIgnoreCase("m") || genero.equalsIgnoreCase("f")) {
				infoValida = true;
			} else {
				System.out.println("Genero precisa ser M ou F:");
			}
		} while(!infoValida);
		
		infoValida = false;
		//estado civil
		do {
			System.out.println("Digite seu estado civil: ");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("s") || 
					estadoCivil.equalsIgnoreCase("c") ||
					estadoCivil.equalsIgnoreCase("v") ||
					estadoCivil.equalsIgnoreCase("d")){
				infoValida = true;
			} else {
				System.out.println("Estado civil precisa ser S, C, V ou D.");
			}
		} while(!infoValida);
		
		System.out.println("Informacoes: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		System.out.println("Genero: " + genero);
		System.out.println("Estado Civil: " + estadoCivil);
	}

}
