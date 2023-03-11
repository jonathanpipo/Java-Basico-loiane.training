//README - Exercicio 2
/****************************************************************************
 *	Crie uma classe Livro que represente os dados básicos de um livro,		*
 *	sem se preocupar com a sua finalidade.									*															*
 ****************************************************************************/

package com.loiane.cursojava.aula24.labs;

public class Exercicio02 {// livro

	public static void main(String[] args) {

		Livro theWitcher = new Livro();
		theWitcher.anoLancamento = 1990;
		theWitcher.nomeAutor = "Andrzej Sapkowski";
		theWitcher.nomeEditora = "WMF Martins Fontes";
		theWitcher.nomeLivro = "O ultimo desejo";
		theWitcher.numeroCapitulos = 13;
		theWitcher.numeroPaginas = 398;

		// output
		System.out.println("The Witcher");
		System.out.println("Nome do autor: " + theWitcher.anoLancamento);
		System.out.println("Nome da editora: " + theWitcher.nomeEditora);
		System.out.println("Nome do livro: " + theWitcher.nomeLivro);
		System.out.println("Ano do lancamento: " + theWitcher.nomeLivro);
		System.out.println("Numero de paginas: " + theWitcher.numeroPaginas);
		System.out.println("Numero de capitulos: " + theWitcher.numeroCapitulos);
	}

}
