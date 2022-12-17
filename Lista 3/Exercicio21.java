package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o numero de turmas:");
		int numTurmas = sc.nextInt();
		
		int somaAlunos = 0;
		double mediaAlunos = 0;
		for (int i = 1; i <= numTurmas; i++) {
			System.out.println("Entre com o numero de alunos da turma " + i);
			int numAlunos = sc.nextInt();
			
			while (numAlunos > 40) {
				System.out.println("Nao se pode cadastrar mais de 40 alunos.");
				numAlunos = sc.nextInt();
			}
			somaAlunos += numAlunos;
		}
		
		mediaAlunos = somaAlunos / numTurmas;
		System.out.println("Media de alunos: " + mediaAlunos);
	}

}
