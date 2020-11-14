package br.com.ialsolucoes.exception;

public class Exececao extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Exececao (String erro) {
		super("Erro no processamento de notas." + erro);
	}

}
