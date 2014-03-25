package br.com.yaw;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Uso das principais interfaces funcionais do pacote java.util.function.
 * 
 * Exemplo de:
 * - Function
 * - Consumer
 * - Predicate
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteFunction {

	public static void main(String[] args) {
		Function<Integer, Integer> fn = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t+t;
			}
		};
		
		operacao(4, fn);
	}
	
	static void operacao(Integer number, Function<Integer, Integer> fn) {
		Integer resultado = fn.apply(number);
		
		Consumer<Integer> cn = new Consumer<Integer>() { //IntConsumer
			@Override
			public void accept(Integer t) {
				System.out.println("Resultado: "+t);	
			}
		};
		
		printInteiro(resultado, cn);
	}
	
	static void printInteiro(int number, Consumer<Integer> cn) {
		cn.accept(number);
		
		Predicate<Integer> criterioAprovado = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t.intValue() > 5;
			}
		};
		
		System.out.println("Aprovado? "+criterioAprovado.test(number));
	}
	
}
