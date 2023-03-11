package com.loiane.cursojava.aula43.labs;

public class AnimalExer03 {

	private String nome;
	private int comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private int velocidade;

	public AnimalExer03() {
		patas = 4;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public String toString() {
		String s = "";
		s += "\nAnimal: " + nome;
		s += "\nComprimento: " + comprimento + " cm";
		s += "\nPatas: " + patas;
		s += "\nCor: " + cor;
		s += "\nAmbiente: " + ambiente;
		s += "\nVelocidade: " + velocidade + " m/s";
		return s;
	}

}
