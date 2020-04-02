package br.com.wendelsegadilha.aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {
	
		int[][][] matrizTridimensional = new int[3][3][3];
		
		for (int i = 0; i < matrizTridimensional.length; i++) {
			for (int j = 0; j < matrizTridimensional[i].length; j++) {
				for (int k = 0; k < matrizTridimensional.length; k++) {
					System.out.println("i = " + i + " - j = " + j + " - k = " + k);
					matrizTridimensional[i][j][k] = i + j + k;
				}
			}
		}
		
		System.out.println();
		
		//Imprimindo uma matriz de 3 x 3 x3
		for (int i = 0; i < matrizTridimensional.length; i++) {
			for (int j = 0; j < matrizTridimensional[i].length; j++) {
				for (int k = 0; k < matrizTridimensional.length; k++) {
					System.out.print(matrizTridimensional[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
