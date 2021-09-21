import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DataAgendaTest {

	@Test
	void CriarCompromisso() {
		LocalTime hora = LocalTime.now();

		Compromisso c = new Compromisso(hora, "Compromisso legal :D", 5, 'B');

		assertEquals(hora, c.getHora());
		assertEquals("Compromisso legal :D", c.getDescricao());
		assertEquals(5, c.getTempo());
		assertEquals('B', c.getPrioridade());
	}

	@Test
	void AdicionarCompromissoNaMesmaHora() {
		DataAgenda d = new DataAgenda();

		LocalTime hora = LocalTime.now();
		Compromisso c = new Compromisso(hora, "Compromisso legal :D", 5, 'B');
		assertTrue(d.addCompromisso(c));

		Compromisso c2 = new Compromisso(hora, "Compromisso conflitante",10,'N');
		assertFalse(d.addCompromisso(c2));
	}

	@Test
	void QuantidadePrioridade() {
		DataAgenda d = new DataAgenda();

		Compromisso c1 = new Compromisso(LocalTime.now(), "Compromisso Importante", 5, 'A');
		d.addCompromisso(c1);

		Compromisso c2 = new Compromisso(LocalTime.NOON, "Compromisso Normal", 3, 'N');
		d.addCompromisso(c2);

		Compromisso c3 = new Compromisso(LocalTime.MIDNIGHT, "Compromisso Baixo", 1, 'B');
		d.addCompromisso(c3);

		Compromisso c4 = new Compromisso(LocalTime.MAX, "Compromisso Explosivo", 3, 'A');
		d.addCompromisso(c4);

		assertEquals(2, d.getQtdCompromissosPrioridade('A'));
		assertEquals(1, d.getQtdCompromissosPrioridade('N'));
		assertEquals(1, d.getQtdCompromissosPrioridade('B'));
	}

	@Test
	void CompromissosPrioridade() {
		DataAgenda d = new DataAgenda();

		Compromisso c1 = new Compromisso(LocalTime.now(), "Compromisso Importante", 5, 'A');
		d.addCompromisso(c1);

		Compromisso c2 = new Compromisso(LocalTime.NOON, "Compromisso Normal", 3, 'N');
		d.addCompromisso(c2);

		Compromisso c3 = new Compromisso(LocalTime.MIDNIGHT, "Compromisso Baixo", 1, 'B');
		d.addCompromisso(c3);

		Compromisso c4 = new Compromisso(LocalTime.MAX, "Compromisso Explosivo", 3, 'A');
		d.addCompromisso(c4);

		ArrayList<Compromisso> resultado = d.getCompromissosPrioridade('N');
		
		assertSame(c2,resultado.get(0));
	}

	/*
	 * @Test void AdicionarDataAgenda() { Agenda a = new Agenda();
	 * 
	 * LocalDate data = LocalDate.now();
	 * 
	 * DataAgenda d1 = new DataAgenda(); d1.setData(data); a.addDataAgenda(d1);
	 * 
	 * DataAgenda d2 = new DataAgenda(); d2.setData(data); a.addDataAgenda(d2);
	 * 
	 * 
	 * assertEquals(1, a.getDatasAgenda().size()); }
	 */
}
