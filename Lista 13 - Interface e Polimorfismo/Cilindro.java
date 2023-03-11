package com.loiane.cursojava.aula46.labs.exer01;

public class Cilindro extends Figura3D {

	private double altura;
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		double areaBase = Math.PI * raio;
		double areaLateral = Math.PI * 2 * raio * altura;
		double areaTotal = (areaBase * 2) + areaLateral;

		return areaTotal;
	}

	@Override
	public double calcularVolume() {
		return Math.pow(raio, 2) * altura;
	}
}
