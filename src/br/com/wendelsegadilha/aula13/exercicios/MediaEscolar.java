package br.com.wendelsegadilha.aula13.exercicios;

import java.util.Scanner;

public class MediaEscolar {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		double nota01, nota02, nota03, nota04, media;
		
		System.out.println("Informe as 4 notas para calacular a média: ");
		nota01 = scan.nextDouble();
		nota02 = scan.nextDouble();
		nota03 = scan.nextDouble();
		nota04 = scan.nextDouble();
		media = (nota01 + nota02 + nota03 + nota04) / 4;
		System.out.println("Média = " + media);
		
	

	}

}
