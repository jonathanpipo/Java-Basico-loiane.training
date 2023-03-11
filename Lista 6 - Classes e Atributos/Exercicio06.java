package com.loiane.cursojava.aula24.labs;

public class Exercicio06 {

	public static void main(String[] args) {

		ContatoAgenda contato = new ContatoAgenda();

		contato.nomeContato = "Joao";
		contato.emailContato = "joao@email.com";
		contato.enderecoContato = "Rua 157, 1500";
		contato.telefones = new String[5];
		contato.telefones[0] = "99999-9999";
		contato.telefones[1] = "88888-8888";
		contato.telefones[2] = "77777-7777";
		contato.telefones[3] = "66666-6666";

		// output
		System.out.println("Contato");
		System.out.println("Nome: " + contato.nomeContato);
		System.out.println("Email: " + contato.emailContato);
		System.out.println("Endereco: " + contato.enderecoContato);
		System.out.println("Telefones: ");
		System.out.println("Tel 1: " + contato.telefones[0]);
		System.out.println("Tel 2: " + contato.telefones[1]);
		System.out.println("Tel 3: " + contato.telefones[2]);
		System.out.println("Tel 4: " + contato.telefones[3]);
	}

}
