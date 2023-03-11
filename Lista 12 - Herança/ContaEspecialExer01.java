package com.loiane.cursojava.aula43.labs;

public class ContaEspecialExer01 extends ContaBancariaExer01 {

	private double limite;

	public ContaEspecialExer01() {
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + "]";
	}

	public boolean sacar(double valor) {
		double saldoComLimite = this.getSaldo() + limite;
		if ((saldoComLimite - valor) >= 0) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
		return false;

	}
}
