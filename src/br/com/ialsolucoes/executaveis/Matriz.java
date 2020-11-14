package br.com.ialsolucoes.executaveis;

public class Matriz {

	public static void main(String[] args) {
		int notas[][] = new int[2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 40;
		notas[1][1] = 40;
		notas[1][2] = 40;
		
		//System.out.println(notas);
		
		for (int i = 0; i < notas.length; i++) { //Percorre as linhas da matriz
			
			System.out.println("=====================================================");
			for (int x = 0; x< notas[i].length; x++) { //Percorre as colunas da matriz
				
				System.out.println("Valor da matriz: " + notas[i][x]);
			}
			
			
		}

	}

}
