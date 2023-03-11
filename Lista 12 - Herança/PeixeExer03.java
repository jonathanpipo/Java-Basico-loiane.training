package com.loiane.cursojava.aula43.labs;

public class PeixeExer03 extends AnimalExer03 {

	private String caracteristicas;

	public PeixeExer03() {
		super();
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
		this.setCaracteristicas("Barbatanas e cauda");
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCaracteristicas: " + caracteristicas;
		return s;
	}

}
