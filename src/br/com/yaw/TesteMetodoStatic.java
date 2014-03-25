package br.com.yaw;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * Exemplo de uma interface com método static.
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteMetodoStatic {

	public static void main(String[] args) {
		
		List<Entrega> entregas = buildEntregas();
		
		entregas.sort(CriterioPontualidade.sortByPrevisao());
		
		for (Entrega e: entregas) {
			System.out.println(e);
		}
		
	}
	
	static List<Entrega> buildEntregas() {
		LocalDateTime hoje = LocalDateTime.now();
		LocalDateTime ontem = hoje.minusDays(1);
		LocalDateTime amanha = hoje.plusDays(1);
		return Arrays.asList(
				new Entrega("Camiseta", 170.0, amanha),
				new Entrega("DVD", 70.0, hoje),
				new Entrega("Livro", 94.0, ontem),
				new Entrega("Vinho", 68.0, hoje));
	}
}
