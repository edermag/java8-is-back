package br.com.yaw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Nova API Date e Time do Java.
 * 
 * Exemplo demonstro como converter uma String em LocalDate, e como formatar LocalDate em String.
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteDateFormat {

	public static void main(String[] args) {
		String texto = "10/04/2014";
		
		//parse
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dt = LocalDate.parse(texto, fmt);
		System.out.println(dt);
		
		//format
		LocalDate agora = LocalDate.now();
		String textoHoje = fmt.format(agora);
		System.out.println(textoHoje);
	}

}
