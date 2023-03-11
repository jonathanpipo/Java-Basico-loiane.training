package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[][] jogoVelha = new char[3][3];

		System.out.println("Jogador 1 - X"); // numeros impares representarao o jogador 'X'
		System.out.println("Jogador 1 - O"); // numeros pares representarao o jogador 'O'

		boolean ganhou = false;
		int jogada = 1;
		int linha = 0;
		int coluna = 0;
		char sinal;

		while (!ganhou) {

			if (jogada % 2 != 0) {
				System.out.println();
				System.out.println("Turno do jogador 1: ");
				System.out.println("Escolha linha e coluna (min-0,max-3)");
				sinal = 'X';

			} else {
				System.out.println();
				System.out.println("Turno do jogador 2: ");
				System.out.println("Escolha linha e coluna (min-0,max-3)");
				sinal = 'O';

			}

			// entrada da linha da matriz
			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Entre com a linha: 1, 2 ou 3");
				linha = sc.nextInt();

				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Entrada invalida. Digite novamente");
				}
			}

			// entrada da coluna da matriz
			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("Entre com a coluna: 1, 2 ou 3");
				coluna = sc.nextInt();

				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada invalida. Digite novamente.");
				}
			}

			// validar jogada
			linha--;
			coluna--;
			if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
				System.out.println("Posicao ja preechida. Tente novamente.");
			} else { // jogada valida
				jogoVelha[linha][coluna] = sinal;
				jogada++;
			}

			// imprimir tabuleiro
			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + " | ");
				}
				System.out.println();
			}

			// verificar ganhador
			if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || // linha1
					(jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || // linha2
					(jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || // linha3
					(jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || // coluna1
					(jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || // coluna2
					(jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || // coluna3
					(jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')
					|| (jogoVelha[2][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[0][2] == 'X')) {

				ganhou = true;
				System.out.println("Parabens. Jogador 1 ganhou!");
			}
			if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || // linha1
					(jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || // linha2
					(jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || // linha3
					(jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || // coluna1
					(jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || // coluna2
					(jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || // coluna3
					(jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') || // diagonal1
					(jogoVelha[2][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[0][2] == 'O')) { // diagonal2

				ganhou = true;
				System.out.println("Parabens. Jogador 2 ganhou!");
			} else if (jogada > 9) {
				ganhou = true;
				System.out.println("Empate.");
			}

			{

			}
		}
	}
}
