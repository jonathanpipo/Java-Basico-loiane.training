package com.loiane.cursojava.aula35.labs;

public class Somatorio {

	public static int Somatorio(int num) {

		if (num == 1) {
			return 1;
		}

		return num + Somatorio(num - 1);
	}
}
