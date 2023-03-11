package com.loiane.cursojava.aula27.labs;

public class Aluno {

	String nomeAluno;
	String matricula;
	String nomeCurso;
	String[] nomeDisciplinas;
	double[][] notasDisciplinas;

	void mostrarInfo() {
		System.out.println("Nome: " + nomeAluno);
		System.out.println("Matricula: " + matricula);
		System.out.println("Curso: " + nomeCurso);
		System.out.println("Notas disciplinas: ");

		for (int i = 0; i < notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina: " + nomeDisciplinas[i]);
			for (int j = 0; j < notasDisciplinas[i].length; j++) {
				System.out.print(notasDisciplinas[i][j] + " ");
			}
			System.out.println();
		}
	}

	boolean verificarSituacao(int indice) {

		double soma = 0;

		if (obterMedia(indice) > 7) {
			return true;
		} else {
			return false;
		}
	}

	double obterMedia(int indice) {
		double soma = 0;

		for (int i = 0; i < notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
		}

		double media = soma / 4;

		return media;
	}

}
