package br.com.yaw;

import java.util.Arrays;
import java.util.List;

/**
 * Outro exemplo do uso de Lambda Expressions com coleções do Java.
 * 
 * Nesse caso para definir critérios de ordenação
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteOrdenaNomesLambda {

	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Pedro", "Ana Paula", "Claudia", "Eduardo");
		
		nomes.sort((o1, o2) -> o1.length() - o2.length()); //ordena pelo tamanho do nome
		
		//outra opcao
		//nomes.sort(Comparator.comparing( (s) -> s.length() ));
		
		System.out.println(nomes);
	}

}
