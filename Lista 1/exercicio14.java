package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho em MB do arquivo para download e a velocidade da internet em MB/s: ");
		
		System.out.println("Arquivo para download: ");
		double arquivo = scan.nextDouble();
		
		System.out.println("Velocidade da internet:  ");
		double internet = scan.nextDouble();
		
		double tempoDownload = arquivo / internet;
		
		System.out.println("O tempo aproximado para download e: " + tempoDownload);
		
	}

}
