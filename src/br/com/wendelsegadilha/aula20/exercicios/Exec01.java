package br.com.wendelsegadilha.aula20.exercicios;

import java.util.Random;

public class Exec01 {

	public static void main(String[] args) {
		
		int[][] numerosAleatorios = new int[4][4];
		
		Random numerosRandom = new Random();
		
		//Atribuindo valores na matriz
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numerosRandom.nextInt(100);
			}
		}
		
		//Imprimindo a matriz
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		
		int maior = 0;
		int linha = 0;
		int coluna = 0;
		
		//Verificando o maior elemento, e sua posição
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				if(numerosAleatorios[i][j] > maior){
					maior = numerosAleatorios[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Maior elemento: " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + coluna);
		
		
		

	}

}
