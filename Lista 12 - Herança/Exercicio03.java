package com.loiane.cursojava.aula43.labs;

public class Exercicio03 {

	public static void main(String[] args) {

		System.out.println("Zoo\n");

		AnimalExer03 animal = new AnimalExer03();
		animal.setNome("Camelo");
		animal.setComprimento(150);
		animal.setCor("Amarelo");
		animal.setAmbiente("Terra");
		animal.setVelocidade(2);

		PeixeExer03 peixe = new PeixeExer03();
		peixe.setNome("Tubarao");
		peixe.setComprimento(300);
		peixe.setVelocidade(1);

		MamiferoExer03 mamifero = new MamiferoExer03();
		mamifero.setNome("Urso-do-canada");
		mamifero.setComprimento(180);
		mamifero.setCor("Vermelho");
		mamifero.setVelocidade(1);

		AnimalExer03[] animais = new AnimalExer03[3];
		animais[0] = animal;
		animais[1] = peixe;
		animais[2] = mamifero;

		System.out.println("-----------------");
		for (AnimalExer03 a : animais) {
			System.out.println(a.toString());
			System.out.println("-----------------");
		}
	}

}
