package br.com.yaw;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Optional;

/**
 * Exemplo de uma interface utilizando método default, static e dois métodos abstratos.
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public interface CriterioPontualidade {

	LocalDateTime getPrevisao();
	
	LocalDateTime getRealizacao();
	
	default boolean isPontual()  {
		LocalDateTime previsao = getPrevisao();
		
		Optional<LocalDateTime> dtRealizacao = Optional.of(getRealizacao());
		return previsao.isBefore(dtRealizacao.orElse(previsao.plusMinutes(1)));
	}
	
	static Comparator<CriterioPontualidade> sortByPrevisao() {
		return (c1, c2) -> c1.getPrevisao().compareTo(c2.getPrevisao());
	}
}
