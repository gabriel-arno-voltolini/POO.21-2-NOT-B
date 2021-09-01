import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class PassageirosHoraTest {

	@Test
	public void teste01_PassageirosDia() {
		PassageirosHora ph = new PassageirosHora();
		ph.adiciona(1, 1, 1);
		ph.adiciona(1, 1, 2);
		ph.adiciona(1, 1, 4);
		ph.adiciona(1, 1, 6);

		assertEquals(4, ph.quantosPassageiros(1, 1));
	}

	@Test
	public void teste02_PassageirosDia() {
		PassageirosHora ph = new PassageirosHora();
		Random r = new Random();
		int qtde = r.nextInt(1000000);
		System.out.println("Quantidade gerada = " + qtde);
		for (int i = 0; i < qtde; i++) {
			ph.adiciona(1, 1, r.nextInt(24));
		}
		assertEquals(qtde, ph.quantosPassageiros(1, 1));
	}

	@Test
	void testMesMenorFluxo() {
		PassageirosHora ph = new PassageirosHora();
		Random r = new Random();
		int mesExpected=0;
		int qtdeExpected = Integer.MAX_VALUE;
		for (int mes = 1; mes <= 12; mes++) {
			int qtde = r.nextInt(10000);
			System.out.println("Quantidade gerada = " + qtde + " = mes " + mes);
			for (int i = 0; i < qtde; i++) {
				ph.adiciona(1, mes, r.nextInt(24));
			}
			if (qtde < qtdeExpected) {
				qtdeExpected = qtde;
				mesExpected = mes;
			}
		}
		int mesMenor = ph.mesMenorFluxo();

		assertEquals(mesExpected, mesMenor);
	}

	@Test
	void testPicoTransporte() {
		fail("Not yet implemented");
	}

}
