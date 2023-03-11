package com.loiane.cursojava.aula33.labs;

public class Aluno {

	private String nomeAluno;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplinas;
	private double[][] notasDisciplinas;

	public Aluno() {
		nomeDisciplinas = new String[3];
		notasDisciplinas = new double[3][4];
	}

	public Aluno(String nomeAluno, String matricula, String nomeCurso, String[] nomeDisciplinas,
			double[][] notasDisciplinas) {
		super();
		this.nomeAluno = nomeAluno;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.nomeDisciplinas = new String[3];
		this.notasDisciplinas = new double[3][4];
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}

	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}

	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}

	public void mostrarInfo() {
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

	public boolean verificarSituacao(int indice) {

		double soma = 0;

		if (obterMedia(indice) > 7) {
			return true;
		} else {
			return false;
		}
	}

	public double obterMedia(int indice) {
		double soma = 0;

		for (int i = 0; i < notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
		}

		double media = soma / 4;

		return media;
	}

	public void setNomeDisciplinaPosicao(int pos, String nomeDisciplina) {
		this.nomeDisciplinas[pos] = nomeDisciplina;
	}

	public void setNotasDisciplinaPosicao(int posI, int posJ, double nota) {
		this.notasDisciplinas[posI][posJ] = nota;
	}

}
