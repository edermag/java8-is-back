package br.com.yaw;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Exemplo da nova API de Stream com Lambda e Collections do Java.
 * 
 * Demonstro como calcular diferenças em fuso.
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteDateTimeI18N {

	public static void main(String[] args) {
		LocalDateTime dtPrevistaBR = LocalDateTime.of(2014, 3, 26, 10, 35);
		
		ZonedDateTime localOrigemZone = ZonedDateTime.of(dtPrevistaBR, ZoneId.systemDefault());
		
		ZoneId localEntregaZoneId = ZoneId.of("America/Bogota"); 
		ZonedDateTime dtPrevista = localOrigemZone.withZoneSameInstant(localEntregaZoneId);
		
		System.out.println("Data Prevista (Brasileira): "+dtPrevistaBR);
		System.out.println("Data Prevista (Bogota): "+dtPrevista.toLocalDateTime());
	}
}
