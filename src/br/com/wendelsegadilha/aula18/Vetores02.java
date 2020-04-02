package br.com.wendelsegadilha.aula18;
import java.util.Arrays;

public class Vetores02 {

	public static void main(String[] args) {
		
		String[] paises = {"Brasi", "R�ssia", "Jap�o", "China", "Argentina"};
		Arrays.sort(paises, 0, paises.length); //Usando a classe Arrays para manipular os dados
		
		int[] pares = {2, 4, 6, 8, 10};
		
		for (int i = 0; i < paises.length; i++) {
			System.out.println(paises[i]);
		}
		
		int posicao= Arrays.binarySearch(paises, "R�ssia");
		System.out.println(posicao);
		
		System.out.println(Arrays.toString(paises));
		
		Double[] valores = {123.45, 678.9};
		System.out.println(valores[0].intValue());

	}

}
