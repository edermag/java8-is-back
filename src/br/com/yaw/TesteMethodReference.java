package br.com.yaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Código demonstra o uso de Method Reference, em Lambda expressions.
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteMethodReference {

	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Pedro", "Ana Paula", "Claudia", "Eduardo");
		
		//definicao de uma function, com lambda via method reference
		Function<String, Integer> strSort = String::length;
		nomes.sort(Comparator.comparing(strSort));
		
		System.out.println(nomes);
		
		final char letra = 'D'; //final implicitamente
		nomes.stream()
			.filter( (s) -> s.toUpperCase().charAt(0) <= letra ) //function
			.forEach(System.out::println); //consumer
		
		HashSet<String> copia = copiaObjetos(nomes, HashSet::new); //aciona construtor via method reference
		String any = copia.stream().findAny().orElse("Não encontrei");
		System.out.println(any);
	}
	
	static <T, F extends Collection<T>, D extends Collection<T>> 
		D copiaObjetos(F fonte, Supplier<D> destino) {
		D colecaoDestino = destino.get();
		for (T t: fonte) {
			colecaoDestino.add(t);
		}
		return colecaoDestino;
	}
	
}
