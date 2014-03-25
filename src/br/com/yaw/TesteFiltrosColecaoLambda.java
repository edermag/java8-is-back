package br.com.yaw;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Exemplo da nova API de Stream com Lambda e Collections do Java.
 * 
 * Evolução do exemplo: TesteFiltrosColecao.java
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteFiltrosColecaoLambda {

	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Claudia", "Danilo", "Fernanda", "Paula", "Andre", "Bruna");
		
		final char letra = 'D';
		
		Predicate<String> filtroMenor = (String t) -> t.toUpperCase().charAt(0) <= letra;
		long qtdeMenores = nomes.stream().filter( filtroMenor ).count();
		System.out.println(String.format("Quantidade de nomes que começam com letra igual ou menor a 'D': %d ", qtdeMenores));
		
		Stream<String> filtrados = nomes.stream().filter( (t) -> { return t.toUpperCase().charAt(0) > letra; } );
		
		System.out.print("\nOs nomes que iniciam com letra maior q 'D': ");
		filtrados.forEach( (t) -> System.out.print(t + " ") );
		System.out.println();
		
		int total = nomes.stream().mapToInt( (s) -> 1 ).sum();
		System.out.println(String.format("\nQuantidade total de nomes %d ", total));
		
		String filtroNome = "Andre";
		boolean existe = nomes.stream().anyMatch( (t) -> t.equalsIgnoreCase(filtroNome) );
		System.out.println(String.format("%nO nome %s, existe na coleção? %s ", filtroNome, existe));
	}
	
}
