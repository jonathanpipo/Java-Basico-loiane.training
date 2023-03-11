package com.loiane.cursojava.aula43.labs;

public class ContaBancariaExer01 {

	private String nomeCliente;
	private String numConta;
	private double saldo;

	public ContaBancariaExer01() {
	}

	public ContaBancariaExer01(String nomeCliente, String numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		String s = "\n\n*** Conta Bancaria ***\n";
		s += "Nome conta cliente: " + getNomeCliente() + "\n";
		s += "Numero conta: " + getNumConta() + "\n";
		s += "Saldo conta: " + getSaldo() + "\n";
		return s;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public boolean sacar(double valor) {
		if ((saldo - valor) >= 0) {
			saldo -= valor;
			return true;
		}
		return false;

	}

}
