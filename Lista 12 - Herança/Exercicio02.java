package com.loiane.cursojava.aula43.labs;

public class Exercicio02 {

	public static void main(String[] args) {

		PessoaFisicaExer02 p1 = new PessoaFisicaExer02();
		p1.setNome("Contribuinte 01");
		p1.setRendaBruta(1000);
		p1.setCpf("583.358.456-62");

		PessoaJuridicaExer02 p2 = new PessoaJuridicaExer02();
		p2.setNome("Contribuinte 02");
		p2.setRendaBruta(5000);
		p2.setCnpj("91.403.512/0001-54");

		PessoaFisicaExer02 p3 = new PessoaFisicaExer02();
		p3.setNome("Contribuinte 03");
		p3.setRendaBruta(2000);
		p3.setCpf("828.277.078-70");

		PessoaJuridicaExer02 p4 = new PessoaJuridicaExer02();
		p4.setNome("Contribuinte 04");
		p4.setRendaBruta(3000);
		p4.setCnpj("10.684.822/0001-92");

		PessoaFisicaExer02 p5 = new PessoaFisicaExer02();
		p5.setNome("Contribuinte 05");
		p5.setRendaBruta(3700);
		p5.setCpf("547.653.548-90");

		PessoaJuridicaExer02 p6 = new PessoaJuridicaExer02();
		p6.setNome("Contribuinte 06");
		p6.setRendaBruta(4000);
		p6.setCnpj("35.434.693/0001-05");

		ContribuinteExer02[] contribuintes = new ContribuinteExer02[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;

		for (ContribuinteExer02 c : contribuintes) {
			System.out.println(c.toString());
		}

	}

}
