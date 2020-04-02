package br.com.wendelsegadilha.aula18.exercicios;

public class Exec11 {

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
		
		int par = 0;
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println(vetorA[i] % 2);
			if((vetorA[i] % 2) == 0){
				par += 1;
			}
		}
		
		System.out.println("A quantidade de elementos pares é " + par);
		
	}

}
