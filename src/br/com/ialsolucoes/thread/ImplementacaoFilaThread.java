package br.com.ialsolucoes.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
							new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add (ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		while(true) {
			Iterator iteracao = pilha_fila.iterator();
		synchronized (iteracao) {  //Bloquear o acesso a esta lista por outro processo
			while(iteracao.hasNext()) {
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); //Pega o objeto atual.
				
				//
				//Aqui ficaria o código do processamento 
				//
				
				System.out.println("-----------------------------------------------");
				
				System.out.println("Nome: " + processar.getNome());
				System.out.println("E-mail: " + processar.getEmail());
				
				iteracao.remove();
				
				try {
					Thread.sleep(100);  //Dar um tempo para descarga de memória.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		}
	}
}
