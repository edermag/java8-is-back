package br.com.yaw;

/**
 * Exemplo clássico do uso de lambda expression na API de Threads do Java.
 * 
 * Lambda expression para criar uma instâncias de Runnable (Functional Interface).
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteThreadLambda {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Modo antigo...");
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread( () -> System.out.println("Modo novo!") );
		t2.start();
		
		Runnable r3 = () -> System.out.println("Modo novo denovo!");
		Thread t3 = new Thread(r3);
		t3.start();
	}
	
}
