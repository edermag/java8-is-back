package br.com.yaw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Exemplo demonstra o uso de métodos default em interfaces da API do Java.
 * 
 * Comparador natural (Comparable) de String, via método <code>naturalOrder</code> static em Comparator.
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteOrdenaNomes4 {

	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Pedro", "Ana Paula", "Claudia", "Eduardo");
		
		nomes.sort(Comparator.naturalOrder());
		
		System.out.println(nomes);
		
	}
}
