package br.com.wendelsegadilha.aula18.exercicios;

public class Exec04 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[8];
		vetorA[0] = 4;
		vetorA[1] = 7;
		vetorA[2] = 9;
		vetorA[3] = 3;
		vetorA[4] = 5;
		vetorA[5] = 12;
		vetorA[6] = 1;
		vetorA[7] = 8;
		
		int[] vetorB = new int[8];
		
		for(int i = 0; i < vetorA.length; i++){
			vetorB[i] = (int) Math.sqrt(vetorA[i]); //Raiz Quadrada
			System.out.println(vetorB[i]);
		}
		
	}

}
