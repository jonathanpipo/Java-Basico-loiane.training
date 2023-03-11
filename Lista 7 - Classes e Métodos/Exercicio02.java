package com.loiane.cursojava.aula27.labs;

public class Exercicio02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();

		conta.numero = "159753";
		conta.agencia = "1574";
		conta.especial = true;
		conta.limiteEspecial = 500.00;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;

		boolean saqueEfetuado = conta.saque(30);
		if (saqueEfetuado) {
			System.out.println("Saque efetuado");
			conta.consultarSaldo();
		} else {
			System.out.println("Saldo insuficiente");
		}

		System.out.println();
		boolean depositoEfetuado = conta.depositar(400);
		if (depositoEfetuado) {
			System.out.println("Deposito efetuado");
			conta.consultarSaldo();
		} else {
			System.out.println("Saldo insuficiente");
		}

		System.out.println();
		conta.consultarSaldo();

		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Esta usando cheque especial");
		} else {
			System.out.println("Nao esta usando cheque especial");
		}

	}

}
