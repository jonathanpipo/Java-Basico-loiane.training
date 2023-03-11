package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um numero: ");
		int num = sc.nextInt();

		boolean primo = true;

		for (int i = 1; i < num; i++) {
			if (num % 2 == 0) {
				System.out.println("Nao e um primo - divisivel por " + i);
				primo = false;
			}
		}

		if (primo) {
			System.out.println("E numero primo");
		}

	}

}
