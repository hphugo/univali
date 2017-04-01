package Exercicio3;

import static org.junit.Assert.*;

import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.junit.Test;

public class TesteJodaTime {
	@Test
	public void verificarDoisDiferenteTres() throws Exception {
		assertNotEquals(2, 3);
		
	}
	
	@Test
	public void testData() throws Exception {
		LocalDate hoje = new LocalDate(2017, 4, 1);
		assertEquals(1, hoje.getDayOfMonth());
		assertEquals(4, hoje.getMonthOfYear());
		assertEquals(2017, hoje.getYear());
	}
	
	@Test
	public void testDataNascimento() throws Exception {
		LocalDate nascimento = new LocalDate(1985, 9, 1);
		assertEquals(1, nascimento.getDayOfMonth());
		assertEquals(9, nascimento.getMonthOfYear());
		assertEquals(1985, nascimento.getYear());
	}
	
    @Test
	public void testeHorarioAcordar() throws Exception {
		LocalTime horario = new LocalTime(8, 30);
		assertEquals(8, horario.getHourOfDay());
		assertEquals(30, horario.getMinuteOfHour());
	}
	
    @Test(expected = IllegalFieldValueException.class)
	public void naoPodeCriarHorarioNegativo() throws Exception {
    	new LocalTime(-10, 0);
		
	}
    
    @Test(expected = IllegalFieldValueException.class)
	public void naoPodeCriarDataInvalida() throws Exception {
    	new LocalDate(2017, 2, 29);
		
	}
    
    @Test
	public void somarDiaAUmaData() throws Exception {
    	LocalDate dataSomada = new LocalDate(2017, 02, 28).plusDays(1);
    	assertEquals(1, dataSomada.getDayOfMonth());
    	assertEquals(3, dataSomada.getMonthOfYear());
    	assertEquals(2017, dataSomada.getYear());
    
	}
    
    @Test
	public void subtrairMilissegundo() throws Exception {
    	LocalTime horaSubtraida = new LocalTime(00, 00, 00, 00).minusMillis(1);
    	assertEquals(999, horaSubtraida.getMillisOfSecond());
    	assertEquals(59, horaSubtraida.getSecondOfMinute());
    	assertEquals(59, horaSubtraida.getMinuteOfHour());
    	assertEquals(23, horaSubtraida.getHourOfDay());
    	
		
	}
    
}
