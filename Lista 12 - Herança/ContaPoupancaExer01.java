package com.loiane.cursojava.aula43.labs;

import java.util.Calendar;

public class ContaPoupancaExer01 extends ContaBancariaExer01 {

	private int diaRendimento;

	public ContaPoupancaExer01() {
	}

	public ContaPoupancaExer01(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		String s = "\n\n*** Conta Poupanca ***\n";
		s += "Dia rendimento: " + getDiaRendimento() + "\n";
		s += super.toString();
		return s;
	}

	public boolean calcularNovoSaldo(double taxaRendimento) {

		Calendar hoje = Calendar.getInstance();

		if (taxaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {

			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento)); // saldo += saldo * taxaRendimento;
			return true;
		}
		return false;
	}

}
