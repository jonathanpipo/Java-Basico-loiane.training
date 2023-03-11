package com.loiane.cursojava.aula33.labs;

public class Exercicio02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.setNumero("159753");
		conta.setAgencia("1574");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500.00);
		conta.setValorEspecialUsado(0);
		conta.setSaldo(-10);

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
