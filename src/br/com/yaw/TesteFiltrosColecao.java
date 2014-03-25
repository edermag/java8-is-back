package br.com.yaw;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

/**
 * Nova API de Stream, que pode ser utilizada com as Collections do Java.
 * 
 * Exemplo com Interfaces funcionais, operando sobre os elementos contidos na coleção.
 * 
 * Stream utilizados para:
 * - filtrar objetos de uma coleção, dada uma condição;
 * - contador de objetos;
 * - verifica se existe um determinado elemento na coleção;
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteFiltrosColecao {

	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Claudia", "Danilo", "Fernanda", "Paula", "Andre", "Bruna");
		char letra = 'D';
		
		//teste dos elementos da coleção, aceita apenas aqueles com a letra inicial menor ou igual a 'D'
		Predicate<String> filtroMenor = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.toUpperCase().charAt(0) <= letra;
			}
		};
		
		long qtdeMenores = nomes.stream().filter(filtroMenor).count();
		System.out.println(String.format("Quantidade de nomes que começam com letra igual ou menor a 'D': %d ", qtdeMenores));
		
		//inverte o criterio do predicate anterior, considera 1a letra maior q 'D'
		Predicate<String> filtroMaior = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.toUpperCase().charAt(0) > letra;
			}
		};
		
		Stream<String> filtrados = nomes.stream().filter(filtroMaior);
		
		Consumer<String> imprimeNome = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.print(t+" ");
			}
		};
		
		System.out.print("\nOs nomes que iniciam com letra maior q 'D': ");
		//executa o Consumer para cada elemento encontrado
		filtrados.forEach(imprimeNome);
		System.out.println();
		
		//outra forma de contar registros na coleção
		ToIntFunction<String> contador = new ToIntFunction<String>() {
			@Override
			public int applyAsInt(String value) {
				return 1;
			}
		};
		
		//transformacao de String em int
		int total = nomes.stream().mapToInt(contador).sum();
		System.out.println(String.format("\nQuantidade total de nomes %d ", total));
		
		final String filtroNome = "Andre";
		//filtra pelo conteudo da String
		Predicate<String> verificaNome = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.equalsIgnoreCase(filtroNome);
			}
		};
		
		//outro uso de Predicate
		boolean existe = nomes.stream().anyMatch(verificaNome);
		System.out.println(String.format("%nO nome %s, existe na coleção? %s ", filtroNome, existe));
	}
	
}
