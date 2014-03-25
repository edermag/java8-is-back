package br.com.yaw;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Exemplo da nova API de Stream com Lambda e Collections do Java.
 * 
 * Demonstro como trabalhar com intervalos de datas.
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteIntervalos {

	public static void main(String[] args) {
		Duration dezMin = Duration.ofMinutes(10);
		
		Instant agora = Instant.now();
		Instant futuro = agora.plus(dezMin);
		System.out.println("Ohando para o futuro (10 min): " + futuro);
		
		LocalDate hoje = LocalDate.now();
		LocalDate proximaData = LocalDate.of(2014, 4, 1);
		Period p = Period.between(hoje, proximaData);
		System.out.println("Quantidade de dias entre uma data e outra: " + p.getDays());
		
		LocalDate dataAniversario = LocalDate.of(1982, 10, 18);
		LocalDate proxDataAniversario = dataAniversario.withYear(hoje.getYear());
		
		if (proxDataAniversario.isBefore(hoje) || proxDataAniversario.isEqual(hoje)) {
			proxDataAniversario = proxDataAniversario.plusYears(1);
		}
		
		long dias = ChronoUnit.DAYS.between(hoje, proxDataAniversario);
		System.out.println("Quantidade de dias para o próximo aniversário: " + dias);
	}

}
