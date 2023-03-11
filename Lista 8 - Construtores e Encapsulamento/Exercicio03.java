package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Entre com o nome do aluno: ");
		aluno.setNomeAluno(sc.next());

		System.out.println("Entre com o nome do curso: ");
		aluno.setNomeCurso(sc.next());

		System.out.println("Entre com a matricula: ");
		aluno.setMatricula(sc.next());

		System.out.println();
		System.out.println("Nome das disciplinas: ");
		for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
			System.out.println("Disciplina - " + (i + 1));
			aluno.setNomeDisciplinaPosicao(i, sc.next());
		}

		System.out.println();
		System.out.println("Notas das disciplinas: ");
		for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
			System.out.println("Notas da disciplina - " + aluno.getNomeDisciplinas()[i]);
			for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
				System.out.println("Entre com a nota da disciplina 1 - Nota " + (j + 1) + "/4: ");
				aluno.setNotasDisciplinaPosicao(i, j, sc.nextDouble());
			}
		}

		System.out.println();
		aluno.mostrarInfo();

		System.out.println();
		System.out.println("Medias das disciplinas: ");
		for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
			System.out.println("Disciplina: " + aluno.getNomeDisciplinas()[i] + " - Media: " + aluno.obterMedia(i));
		}

		System.out.println();
		System.out.println("Situacao do aluno nas disciplinas: ");
		for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
			if (aluno.verificarSituacao(i)) {
				System.out.println("Disciplina: " + aluno.getNomeDisciplinas()[i] + " - APROVADO!");
			} else {
				System.out.println("Disciplina: " + aluno.getNomeDisciplinas()[i] + " - REPROVADO!");
			}
		}
	}
}
