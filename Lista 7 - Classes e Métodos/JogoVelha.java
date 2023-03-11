package com.loiane.cursojava.aula27.labs;

public class JogoVelha {

	char[][] jogoVelha = new char[3][3];
	int jogada = 1;

	boolean validarJogada(int linha, int coluna, char sinal) {
		if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
			return false;
		} else {
			jogoVelha[linha][coluna] = sinal;
			jogada++;
			return true;
		}
	}

	void imprimirTabuleiro() {
		for (int i = 0; i < jogoVelha.length; i++) {
			for (int j = 0; j < jogoVelha[i].length; j++) {
				System.out.print(jogoVelha[i][j] + " | ");
			}
			System.out.println();
		}
	}

	boolean verificarGanhador(char sinal) {
		if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) || // linha1
				(jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) || // linha2
				(jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) || // linha3
				(jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) || // coluna1
				(jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) || // coluna2
				(jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) || // coluna3
				(jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal)
				|| (jogoVelha[2][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[0][2] == sinal)) {
			return true;
		} else {
			return false;
		}
	}
}
