package br.com.yaw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Exemplo demonstra o uso de métodos default em interfaces da API do Java.
 * 
 * Ordenar uma lista de nomes, de acordo com o conteúdo da string (descendente).
 * <code>Comparator</code> define o método <code>reversed</code>.
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteOrdenaNomes2 {

	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Pedro", "Ana Paula", "Claudia", "Eduardo");
		
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2); //ordem natual (Comparable)
			}
		};
		
		nomes.sort(comparator.reversed());
		
		System.out.println(nomes);
	}
	
}
