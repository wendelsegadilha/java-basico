package br.com.wendelsegadilha.aula18.exercicios;

public class Exec01 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[5];
		vetorA[0] = 4;
		vetorA[1] = 7;
		vetorA[2] = 9;
		vetorA[3] = 3;
		vetorA[4] = 5;
		
		int[] vetorB = new int[5];
		
		for(int i = 0; i < vetorA.length; i++){
			vetorB[i] = vetorA[i];
			System.out.println(vetorB[i]);
		}
		
	}

}
