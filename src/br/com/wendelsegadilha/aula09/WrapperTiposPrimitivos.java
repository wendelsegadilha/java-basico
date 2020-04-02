package br.com.wendelsegadilha.aula09;

public class WrapperTiposPrimitivos {

	public static void main(String[] args) {
		
		Integer identificacao = new Integer(123456);
		Double salario = new Double("1250.47");
		Boolean ativo = new Boolean(true);
		
		//Conversão de topos
		int i1 = identificacao.intValue();
		short s1 = identificacao.shortValue();
		
		//Conversão estatica
		int i2 = Integer.parseInt("123"); //acessando método estatico
		
		//Conversão atravez de base - binária, octal ou hexadecimal
		int b1 = Integer.valueOf("101011", 2);
		
		System.out.println(b1);

	}

}
