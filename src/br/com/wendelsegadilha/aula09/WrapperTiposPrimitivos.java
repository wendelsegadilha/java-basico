package br.com.wendelsegadilha.aula09;

public class WrapperTiposPrimitivos {

	public static void main(String[] args) {
		
		Integer identificacao = new Integer(123456);
		Double salario = new Double("1250.47");
		Boolean ativo = new Boolean(true);
		
		//Convers�o de topos
		int i1 = identificacao.intValue();
		short s1 = identificacao.shortValue();
		
		//Convers�o estatica
		int i2 = Integer.parseInt("123"); //acessando m�todo estatico
		
		//Convers�o atravez de base - bin�ria, octal ou hexadecimal
		int b1 = Integer.valueOf("101011", 2);
		
		System.out.println(b1);

	}

}
