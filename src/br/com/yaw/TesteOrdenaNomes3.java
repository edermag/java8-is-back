package br.com.yaw;

import java.util.Arrays;
import java.util.List;

/**
 * Exemplo demonstra o uso de métodos default em interfaces da API do Java.
 * 
 * Utilizo um Comparador de Strings, uma interface filha de Comparator com compare default.
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteOrdenaNomes3 {

	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Pedro", "Ana Paula", "Claudia", "Eduardo");
		
		nomes.sort(new StringComparator() {});
		
		System.out.println(nomes);
		
	}
}
