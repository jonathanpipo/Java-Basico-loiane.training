package com.loiane.cursojava.aula36.labs;

public class Curso {

	private String nomeCurso;
	private String horarioCurso;
	private Professor professores;
	private Aluno[] alunos;

	public Curso() {
	}

	public Curso(String nomeCurso, String horarioCurso, Professor professores, Aluno[] alunos) {
		super();
		this.nomeCurso = nomeCurso;
		this.horarioCurso = horarioCurso;
		this.professores = professores;
		this.alunos = alunos;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getHorarioCurso() {
		return horarioCurso;
	}

	public void setHorarioCurso(String horarioCurso) {
		this.horarioCurso = horarioCurso;
	}

	public Professor getProfessores() {
		return professores;
	}

	public void setProfessores(Professor professores) {
		this.professores = professores;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public String obterInfo() {
		String info = "Nome do curso =" + nomeCurso + "\n";

		if (professores != null) {
			info += professores.obterInfo();
		}

		if (alunos != null) {
			System.out.println("---Alunos---");
			for (Aluno aluno : alunos) {
				info += aluno.obterInfo();
				info += "\n";
			}
			info += "\nMedia da turma: " + obterMediaTurma();
		}
		return info;
	}

	public double obterMediaTurma() {
		double soma = 0;
		for (Aluno aluno : alunos) {
			if (aluno != null) {
				soma += aluno.obterMedia();
			}
		}
		return soma / alunos.length;
	}

}
