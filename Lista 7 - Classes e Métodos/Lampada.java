package com.loiane.cursojava.aula27.labs;

public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String corLuz;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;

	boolean ligada;

	public void ligar() {
		ligada = true;
	}

	public void desligar() {
		ligada = false;
	}

	public void mostrarEstado() {
		if (ligada) {
			System.out.println("A lampada esta ligada");
		} else {
			System.out.println("A lampada esta desligada");
		}
	}

	public void mudarEstado() {
		if (ligada) {
			desligar();
		} else {
			ligar();
		}
	}
}