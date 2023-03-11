package com.loiane.cursojava.aula24.labs;

public class Exercicio05 {

	public static void main(String[] args) {

		ContaCorrente contaTeste = new ContaCorrente();

		contaTeste.idNumero = "159753";
		contaTeste.agencia = "1574";
		contaTeste.saldo = 1500.00;
		contaTeste.limiteEspecial = 5000.00;
		contaTeste.statusEspecial = true;

		// output
		System.out.println("ID conta: " + contaTeste.idNumero);
		System.out.println("Agencia: " + contaTeste.agencia);
		System.out.println("Saldo: " + contaTeste.saldo);
		System.out.println("Limite Especial: " + contaTeste.limiteEspecial);
		System.out.println("Conta Especial: " + contaTeste.statusEspecial);
	}

}
