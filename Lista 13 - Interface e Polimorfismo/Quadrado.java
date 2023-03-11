package com.loiane.cursojava.aula46.labs.exer01;

public class Quadrado extends Figura2D {

	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(lado, 2);
	}
}
