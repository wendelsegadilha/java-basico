package br.com.wendelsegadilha.aula18.exercicios;

public class Exec05 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		vetorA[0] = 4;
		vetorA[1] = 7;
		vetorA[2] = 9;
		vetorA[3] = 3;
		vetorA[4] = 5;
		vetorA[5] = 12;
		vetorA[6] = 1;
		vetorA[7] = 8;
		vetorA[8] = 15;
		vetorA[9] = 11;
		
		int[] vetorB = new int[10];
		vetorB[0] = 10;
		vetorB[1] = 15;
		vetorB[2] = 12;
		vetorB[3] = 13;
		vetorB[4] = 20;
		vetorB[5] = 22;
		vetorB[6] = 33;
		vetorB[7] = 31;
		vetorB[8] = 19;
		vetorB[9] = 18;
		
		
		int[] vetorC = new int[10];
		
		for(int i = 0; i < vetorC.length; i++){
			int soma = (vetorA[i] + vetorB[i]);
			vetorC[i] = soma;
			System.out.println(vetorC[i]);
		}
		
	}

}
