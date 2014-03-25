package br.com.yaw;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TesteString {

	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Claudia", "Danilo", "Fernanda", "Paula", "Andre", "Bruna");
		
		String textoNomes = String.join(", ", nomes);
		System.out.println(textoNomes);
		
		LocalDateTime hoje = LocalDateTime.now();
		LocalDateTime amanha = hoje.plusDays(1);
		List<Entrega> entregas = Arrays.asList(
				new Entrega("Java 8 in Action", 120.0, hoje),
				new Entrega("TV Samsung 60pol", 1105.0, amanha),
				new Entrega("Cachaça", 50.0, amanha));
		
		String joinedProdutos = entregas.stream()
				.map(Entrega::getProduto)
				.collect(Collectors.joining(", "));
		
		System.out.println(joinedProdutos);
	}
	
}
