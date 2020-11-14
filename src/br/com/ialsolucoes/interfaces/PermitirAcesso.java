package br.com.ialsolucoes.interfaces;

public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);
	
	public boolean autenticar();

}
