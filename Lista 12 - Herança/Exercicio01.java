package com.loiane.cursojava.aula43.labs;

public class Exercicio01 {

	public static void main(String[] args) {

		System.out.println("*** Teste conta bancaria ***");

		ContaBancariaExer01 contaBancaria = new ContaBancariaExer01();
		contaBancaria.setNomeCliente("Cliente conta especial");
		contaBancaria.setNumConta("33333");

		contaBancaria.depositar(100);

		realizarSaque(contaBancaria, 50);

		realizarSaque(contaBancaria, 70);

		System.out.println(contaBancaria);

		System.out.println();
		System.out.println("*** Teste conta poupanca ***");

		ContaPoupancaExer01 contaPoupanca = new ContaPoupancaExer01();
		contaPoupanca.setNomeCliente("Cliente conta poupanca");
		contaPoupanca.setNumConta("222222");
		contaPoupanca.setDiaRendimento(0);
		contaPoupanca.depositar(100);

		realizarSaque(contaPoupanca, 50);

		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado.\nNovo saldo: " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje nao e dia de rendimento.\nNovo saldo nao calculado.");
		}

		System.out.println(contaPoupanca);

		System.out.println();
		System.out.println("*** Teste conta especial ***");

		ContaEspecialExer01 contaEspecial = new ContaEspecialExer01();
		contaEspecial.setNomeCliente("Cliente conta especial");
		contaEspecial.setNumConta("33333");
		contaEspecial.setLimite(50);

		contaEspecial.depositar(100);

		realizarSaque(contaEspecial, 50);

		realizarSaque(contaEspecial, 70);

		realizarSaque(contaEspecial, 80);

		System.out.println(contaEspecial);

	}

	private static void realizarSaque(ContaBancariaExer01 conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque de R$" + valor + " efetuado com sucesso.\nNovo saldo: " + conta.getSaldo());
		} else {
			System.out.println("Saque de R$" + valor + " negado. "
					+ "\nSaldo insuficiente. Tente de novo.\nNovo saldo: " + conta.getSaldo());
		}
		;
	}

}
