package com.loiane.cursojava.aula24.labs;

public class Exercicio01 { // lampada

	public static void main(String[] arg) {
		Lampada luminaria = new Lampada();
		luminaria.corLuz = "amarela";
		luminaria.formato = new String[1];
		luminaria.formato[0] = "abajur";
		luminaria.garantiaMeses = 12;
		luminaria.marca = "Positivo Casa Inteligente";
		luminaria.potencia = 9.0;

		// output
		System.out.println("Luminaria");
		System.out.println("Cor: " + luminaria.corLuz);
		System.out.println("Formato: " + luminaria.formato[0]);
		System.out.println("Tempo de garantia: " + luminaria.garantiaMeses);
		System.out.println("Marca: " + luminaria.marca);
		System.out.println("Potencia: " + luminaria.potencia);
	}

}
