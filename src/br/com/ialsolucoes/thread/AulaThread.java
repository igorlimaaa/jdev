package br.com.ialsolucoes.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		
		
		
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		Thread threadNfe = new Thread(thread2);
		threadNfe.start();
		
		
//		new Thread() {
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					
//					
//					System.out.println(i + " Executando algo na rotina1, por exemplo");
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			};
//		}.start();
		
		
//		new Thread() {
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					
//					
//					System.out.println(i + " Executando algo na rotina2, por exemplo");
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			};
//		}.start();
//		
		
		System.out.println("Chegou ao fim do código");
		JOptionPane.showMessageDialog(null, "Continua executando para o usuário");
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				
				
				System.out.println(i + " Executando algo na rotina1, por exemplo");
				
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
			}
			
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				
				
				System.out.println(i + " Executando algo na rotina2, por exemplo");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};

}
