package br.com.wendelsegadilha.aula13.exercicios;

import java.util.Scanner;

public class TabuadaMultiplicacao {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe o valor: ");
		int valor = scan.nextInt();
		
		/**
		 * Tabuada usando laço de repetição FOR
		 */
		for(int i = 0; i <= 10; i++){
			System.out.println(valor + " * " + i + " = " + valor * i);
		}
		
		System.out.println("==========================================");
		
		/**
		 * Tabuada usando laço de repetição WHILE
		 */
		int j = 0;
		while(j <= 10){
			System.out.println(valor + " * " + j + " = " + valor * j);
			j++;
		}
		
		System.out.println("==========================================");
		
		/**
		 * Tabuada usando laço de repetição DO WHILE
		 */
		int w = 0;
		do{
			System.out.println(valor + " * " + w + " = " + valor * w);
			w++;
		}while(w <= 10);

	}

}
