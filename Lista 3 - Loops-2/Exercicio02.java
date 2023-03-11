package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean loginValido = false;
		String login;
		String senha;

		do {
			System.out.println("Login:");
			login = scan.next();

			System.out.println("Senha:");
			senha = scan.next();

			if (login.equalsIgnoreCase(senha)) {
				// loginValido = false;
				System.out.println("Invalido! Login e senha iguais.");
				System.out.println("Digite novamente");

			} else {
				loginValido = true;
				System.out.println("Logado com sucesso!");
			}

		} while (!loginValido);

	}

}
