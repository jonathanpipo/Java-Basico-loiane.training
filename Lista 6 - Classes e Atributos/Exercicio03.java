package com.loiane.cursojava.aula24.labs;

public class Exercicio03 {

	public static void main(String[] args) {

		LivroDeLivraria harryPotter = new LivroDeLivraria();

		harryPotter.valor = 59.90;
		harryPotter.unidadesEstoque = 15;
		harryPotter.anoLancamento = 2000;
		harryPotter.nomeAutor = "J K Rowling";
		harryPotter.nomeEditora = "Rocco";
		harryPotter.nomeLivro = "A camara secreta";
		harryPotter.numeroCapitulos = 8;
		harryPotter.numeroPaginas = 288;

		// output
		System.out.println("Harry Potter");
		System.out.println("Valor: $" + harryPotter.valor);
		System.out.println("Quantidade estoque: " + harryPotter.unidadesEstoque);
		System.out.println("Nome do autor: " + harryPotter.nomeAutor);
		System.out.println("Nome da editora: " + harryPotter.nomeEditora);
		System.out.println("Nome do livro: " + harryPotter.nomeLivro);
		System.out.println("Ano do lancamento: " + harryPotter.nomeLivro);
		System.out.println("Numero de paginas: " + harryPotter.numeroPaginas);
		System.out.println("Numero de capitulos: " + harryPotter.numeroCapitulos);
	}

}
