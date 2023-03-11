package com.loiane.cursojava.aula24.labs;

import java.util.Date;

public class Exercicio04 {

	public static void main(String[] args) {

		LivroDeBiblioteca livro = new LivroDeBiblioteca();

		livro.numeroPaginas = 390;
		livro.numeroCapitulos = 15;
		livro.anoLancamento = 2004;
		livro.nomeLivro = "O livro A";
		livro.nomeAutor = "Giuseppi Ferdinandi";
		livro.nomeEditora = "Papi";

		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.nomeResponsavel = "Rafael Merculano";

		// output
		System.out.println("Nome do autor: " + livro.nomeAutor);
		System.out.println("Nome da editora: " + livro.nomeEditora);
		System.out.println("Nome do livro: " + livro.nomeLivro);
		System.out.println("Ano do lancamento: " + livro.anoLancamento);
		System.out.println("Numero de paginas: " + livro.numeroPaginas);
		System.out.println("Numero de capitulos: " + livro.numeroCapitulos);
	}

}
