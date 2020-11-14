package br.com.ialsolucoes.classauxiliares;

import br.com.ialsolucoes.interfaces.PermitirAcesso;

public class FuncAutenticar {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticarCursoJava() {
		return permitirAcesso.autenticar();
	}
	
	public FuncAutenticar(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
