package br.com.ialsolucoes.executaveis;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		
		String texto = " Igor, de Almeida, Lima";
		
		String[] valoresArray = texto.split(",");
		
		System.out.println(valoresArray);
		
		//Convertendo um array em uma lista.
		
		List<String> list = Arrays.asList(valoresArray);
		
		for (String valorString : list) {
			System.out.println(valorString);
		}
		
		
		//Convertendo uma lista para Array.
		String[] conversaoArray = list.toArray(new String[6]);

	}

}
