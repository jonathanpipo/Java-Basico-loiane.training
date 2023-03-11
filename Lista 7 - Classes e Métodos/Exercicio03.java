package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Entre com o nome do aluno: ");
		aluno.nomeAluno = sc.next();

		System.out.println("Entre com o nome do curso: ");
		aluno.nomeCurso = sc.next();

		System.out.println("Entre com a matricula: ");
		aluno.matricula = sc.next();

		System.out.println();
		aluno.nomeDisciplinas = new String[3];
		System.out.println("Nome das disciplinas: ");
		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			System.out.println("Disciplina - " + (i + 1));
			aluno.nomeDisciplinas[i] = sc.next();
		}

		System.out.println();
		aluno.notasDisciplinas = new double[3][4];
		System.out.println("Notas das disciplinas: ");
		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			System.out.println("Notas da disciplina - " + aluno.nomeDisciplinas[i]);
			for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Entre com a nota da disciplina 1 - Nota " + (j + 1) + "/4: ");
				aluno.notasDisciplinas[i][j] = sc.nextDouble();
			}
		}

		System.out.println();
		aluno.mostrarInfo();

		System.out.println();
		System.out.println("Medias das disciplinas: ");
		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Disciplina: " + aluno.nomeDisciplinas[i] + " - Media: " + aluno.obterMedia(i));
		}

		System.out.println();
		System.out.println("Situacao do aluno nas disciplinas: ");
		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			if (aluno.verificarSituacao(i)) {
				System.out.println("Disciplina: " + aluno.nomeDisciplinas[i] + " - APROVADO!");
			} else {
				System.out.println("Disciplina: " + aluno.nomeDisciplinas[i] + " - REPROVADO!");
			}
		}

	}

}
