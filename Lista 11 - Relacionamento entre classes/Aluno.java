package com.loiane.cursojava.aula36.labs;

public class Aluno {

	private String nomeAluno;
	private int matriculaAluno;
	private double[] notas;

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nomeAluno, int matriculaAluno, double[] notas) {
		super();
		this.nomeAluno = nomeAluno;
		this.matriculaAluno = matriculaAluno;
		this.notas = notas;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String obterInfo() {
		String info = "Nome aluno: " + nomeAluno + ";";
		info += "Matricula: " + matriculaAluno + ";";
		info += "Notas: ";

		int soma = 0;
		for (double nota : notas) {
			soma += nota;
			info += nota + " ";
		}
		double media = soma / 4;
		info += "\n" + "Media = " + media + " - ";

		if (media >= 7) {
			info += "Aprovado";
		} else {
			info += "Reprovado";
		}
		return info;
	}

	public double obterMedia() {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / 4;

	}
}
