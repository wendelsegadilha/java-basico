package br.com.wendelsegadilha.aula18;

public class Vetores {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[365];
		
		temperaturas[0] = 32.4;
		temperaturas[1] = 34.8;
		temperaturas[2] = 35;
		temperaturas[3] = 32;
		temperaturas[4] = 34.6;
		
		//Percorrendo Array
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Temperatura do dia " + (i + 1) + " é " + temperaturas[i]);
		}
		
		//Usando foreach - OBS: não há como pegar o índice do array
		for(double temp : temperaturas){
			System.out.println(temp);
		}
		

	}

}
