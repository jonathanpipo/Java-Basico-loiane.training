package com.loiane.cursojava.aula43.labs;

public class MamiferoExer03 extends AnimalExer03 {

	private String alimento;

	public MamiferoExer03() {
		super();
		this.setCor("Castanho");
		this.setAlimento("Mel");
		this.setAmbiente("Terra");
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nAlimento: " + alimento;
		return s;
	}
}
