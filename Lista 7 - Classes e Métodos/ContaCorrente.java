package com.loiane.cursojava.aula27.labs;

public class ContaCorrente {

	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;

	boolean saque(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;

		} else {
			if (especial) {
				double limite = limiteEspecial + saldo;

				if (limite >= valor) {
					saldo -= valor;
					return true;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	boolean depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			return true;
		} else {
			System.out.println("Digite um valor maior que ZERO.");
			return false;
		}

	}

	void consultarSaldo() {
		System.out.println("Saldo atual: " + saldo);
	}

	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
}
