package br.com.yaw;

import java.util.Comparator;

/**
 * Comparator de Strings, definido via interface com método compare, implementado via default.
 * 
 * Comportamento bem próximo a uma classe abstrata.
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public interface StringComparator extends Comparator<String> {
	
	@Override
	default int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
	
}
