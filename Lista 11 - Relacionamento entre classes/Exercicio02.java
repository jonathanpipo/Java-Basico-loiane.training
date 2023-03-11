package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o nome do curso: ");
		String nome = sc.next();

		System.out.println("Entre com o horario do curso: ");
		String horario = sc.next();

		System.out.println("Entre com o nome do professor: ");
		String nomeProf = sc.next();

		System.out.println("Entre com o departamento do professor: ");
		String departamentoProf = sc.next();

		System.out.println("Entre com o email do professor: ");
		String emailProf = sc.next();

		Curso curso = new Curso();
		curso.setNomeCurso(nome);
		curso.setHorarioCurso(horario);

		Professor professor = new Professor();
		professor.setNomeProfessor(nomeProf);
		professor.setDepartamento(departamentoProf);
		professor.setEmailProfessor(emailProf);

		curso.setProfessores(professor);

		System.out.println("---Alunos---");

		Aluno[] alunos = new Aluno[5];
		for (int i = 0; i < 5; i++) {

			sc.nextLine();

			System.out.println("Entre com as informacoes do aluno " + (i + 1));
			System.out.println("Nome do aluno: ");
			String nomeAluno = sc.next();

			System.out.println("Matricula do aluno: ");
			int matricula = sc.nextInt();

			double[] notas = new double[4];
			System.out.println("Entre com as notas do aluno: ");
			for (int j = 0; j < 4; j++) {
				System.out.println("Nota " + (j + 1) + " :");
				notas[j] = sc.nextDouble();
			}

			Aluno aluno = new Aluno();
			aluno.setNomeAluno(nomeAluno);
			aluno.setMatriculaAluno(matricula);
			aluno.setNotas(notas);

			alunos[i] = aluno;
		}

		curso.setAlunos(alunos);

		System.out.println(curso.obterInfo());

	}

}
