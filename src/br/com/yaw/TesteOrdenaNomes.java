package br.com.yaw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Exemplo demonstra o uso de métodos default em interfaces da API do Java.
 * 
 * Ordenar uma lista de nomes, de acordo com o tamanho do nome, 
 * via método <code>sort</code> em <code>List</code>.
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteOrdenaNomes {

	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Pedro", "Ana Paula", "Claudia", "Eduardo");
		
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length(); //tamanho da string
			}
		};
		
		nomes.sort(comparator);
		
		System.out.println(nomes);
	}
}
