package br.com.yaw;

import java.util.HashMap;
import java.util.Map;

/**
 * Exemplo explora as novidades na API de Map.
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("TI", "Paulo");
		map.put("Comercial", "Andrea");
		
		String rh = map.getOrDefault("RH", "Vazio...");
		System.out.println(rh);
		
		//concat do conteudo
		map.merge("TI", "Andre", (v1, v2) -> String.join(", ", v1, v2) );
		
		//imprime o conteudo de cada Entry do Map
		map.forEach((k, v) -> System.out.println("Depto: "+k +" - Funcionarios: "+v));
	}
}
