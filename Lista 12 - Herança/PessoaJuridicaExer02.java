package com.loiane.cursojava.aula43.labs;

public class PessoaJuridicaExer02 extends ContribuinteExer02 {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return this.getRendaBruta() * 0.1;
	}

	@Override
	public String toString() {
		String s = "\nPessoa Juridica\n";
		s += super.toString();
		s += "\nCNPJ: " + cnpj;
		s += "\nImposto a ser pago: " + calcularImposto();
		return s;
	}

}
