package br.com.yaw;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Exemplo da nova API de Stream com Lambda e Collections do Java.
 * 
 * 
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteFiltrosEntregaLambda {

	public static void main(String[] args) {
		List<String> produtos = Arrays.asList("Livro");
		List<Entrega> entregas = buildEntregas();
		
		List<Entrega> entregasMatch = 
				entregas.stream()
					.filter( e -> (produtos.stream().anyMatch(e.getProduto()::contains)) )
					.collect(Collectors.toList());
		
		entregasMatch.forEach(System.out::println);
	}
	
	static List<Entrega> buildEntregas() {
		LocalDateTime hoje = LocalDateTime.now();
		LocalDateTime ontem = hoje.minusDays(1);
		LocalDateTime amanha = hoje.plusDays(1);
		return Arrays.asList(
				new Entrega("Camiseta", 170.0, amanha),
				new Entrega("DVD", 70.0, hoje),
				new Entrega("Livro Java", 94.0, ontem),
				new Entrega("Livro Programação", 94.0, ontem),
				new Entrega("Notebook", 1990.0, ontem),
				new Entrega("Vinho", 68.0, hoje));
	}
}
