package br.com.yaw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Nova API de Stream, que pode ser utilizada com as Collections do Java.
 * 
 * Nesse exemplo demonstro como remover duplicidades, pular elementos e limitar o resultado do stream;
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteColecoesStream {

	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Andre", "Danilo", "Danilo", "Paula", "Andre", "Bruna");

		List<String> semDuplicidade = nomes.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(semDuplicidade);
		
		String maior = nomes.stream()
				.max(Comparator.naturalOrder())
				.orElse("Não encontrei"); //optional
		System.out.println(maior);
		
		String segundo = nomes.stream()
				.skip(1)
				.limit(1)
				.findAny()
				.orElse("Não encontrei"); //optional
		System.out.println(segundo);
		
		Double mediaChars = nomes.stream()
				.mapToInt( (s) -> s.length() )
				.average()
				.orElse(0);
		System.out.println(mediaChars);
	}
	
}
