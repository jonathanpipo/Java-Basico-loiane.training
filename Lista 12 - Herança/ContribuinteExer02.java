package com.loiane.cursojava.aula43.labs;

public abstract class ContribuinteExer02 {

	private String nome;
	private double rendaBruta;

	public ContribuinteExer02() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public abstract double calcularImposto();

	@Override
	public String toString() {
		String s = "Nome: " + nome;
		s += "\nRenda bruta: " + rendaBruta;

		return s;
	}

}
