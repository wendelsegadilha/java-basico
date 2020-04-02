package br.com.wendelsegadilha.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[2][4];
		
		notasAlunos[0][0] = 9;
		notasAlunos[0][1] = 8;
		notasAlunos[0][2] = 7.5;
		notasAlunos[0][3] = 10;
		
		notasAlunos[1][0] = 6;
		notasAlunos[1][1] = 9;
		notasAlunos[1][2] = 8.5;
		notasAlunos[1][3] = 9.75;
		
		/**
		 * Outra maneira de iniciar um array
		 * double[][] notasAlunos = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}}
		 */
		
		//Percorrendo as linhas
		for(int i = 0; i < notasAlunos.length; i++){
			
			//Percorrendo as colunas de cada linha
			for(int j = 0; j < notasAlunos[i].length; j++){
				System.out.print(notasAlunos[i][j] +  " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Percorrendo as linhas
		double soma;
		for(int i = 0; i < notasAlunos.length; i++){
			soma = 0;
			//Percorrendo as colunas de cada linha
			for(int j = 0; j < notasAlunos[i].length; j++){
				soma += notasAlunos[i][j]; //Somando todas as notas do aluno
			}
			System.out.println("Média aluno " + i + " é " + (soma/4));
		}
		
	}

}
