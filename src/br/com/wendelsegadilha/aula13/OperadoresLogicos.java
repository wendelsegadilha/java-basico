package br.com.wendelsegadilha.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int valor01 = 10;
		int valor02 = 4;
		boolean resultado;
		
		//AND
		resultado = ((valor01 == valor02) && (valor01 >= valor02));
		System.out.println(resultado);
		
		//OR
		resultado = ((valor01 == valor02) || (valor01 >= valor02));
		System.out.println(resultado);
		
		//NOT
		resultado = (!(valor01 == valor02) && (valor01 >= valor02));
		System.out.println(resultado);
	}

}
