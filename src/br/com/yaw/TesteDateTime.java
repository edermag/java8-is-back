package br.com.yaw;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Exemplo da nova API de Stream com Lambda e Collections do Java.
 * 
 * Demonstro as principais classes:
 * - ZonedId: identificador do TimeZone
 * - Clock: tem capacidade de adquirir o momento atual (opcional);
 * - Instant: representa um momento no tempo;
 * - LocalDateTime: representa data e hora;
 * - LocalDate: representa data;
 * - LocalTime: representa hora;
 * - TemporalAdjuster: calculo de datas;
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteDateTime {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println("ZoneId: " + zone);
		
		Clock clock = Clock.system(zone);
		System.out.println(clock.millis());
		Instant agora = clock.instant();
		System.out.println("Instant: " + agora);
		
		LocalDateTime agoraDataHora = LocalDateTime.now();
		System.out.println("LocalDateTime.now(): " + agoraDataHora);
		
		LocalDate hoje = LocalDate.now();
		System.out.println("LocalDate.now(): " + hoje);
		System.out.println("hoje.getDayOfMonth(): " + hoje.getDayOfMonth());
		System.out.println("hoje.getMonthValue(): " + hoje.getMonthValue());
		System.out.println("hoje.getYear(): " + hoje.getYear());
		
		LocalDate depoisDeAmanha = hoje.plusDays(2);
		System.out.println("Depois de amanhã (LocalDate): " + depoisDeAmanha);
		

		TemporalAdjuster adj = TemporalAdjusters.next(DayOfWeek.MONDAY);
		LocalDate proxSemana = hoje.with(adj);
		System.out.println("Próxima semana: " + proxSemana);
		
		LocalTime horario = LocalTime.now();
		System.out.println("LocalTime.now(): " + horario);
		System.out.println("horario.getHour(): " + horario.getHour());
		System.out.println("horario.getMinute(): " + horario.getMinute());
		System.out.println("horario.getSecond(): " + horario.getSecond());

	}
	
}
