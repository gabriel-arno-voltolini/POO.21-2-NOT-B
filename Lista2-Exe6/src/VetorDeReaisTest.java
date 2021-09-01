import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VetorDeReaisTest {

	@Test
	void testDivide01_VetoresTamanhosDiferentes() {
		// Arrange
		VetorDeReais v = new VetorDeReais(3);
		v.setValor(2, 0);
		v.setValor(-1, 1);
		v.setValor(3.5, 2);

		VetorDeReais v2 = new VetorDeReais(1);
		v2.setValor(3, 0);

		// Act & Assert
		assertNull(v.divide(v2));
	}

	@Test
	void testDivide02_VetoresTamanhosIguais() {
		VetorDeReais v = new VetorDeReais(3);
		v.setValor(2, 0);
		v.setValor(-1, 1);
		v.setValor(3.5, 2);

		VetorDeReais v2 = new VetorDeReais(3);
		v2.setValor(3, 0);
		v2.setValor(2, 1);
		v2.setValor(1, 2);
		
		VetorDeReais resultado = v.divide(v2);
		
		assertEquals(0.6666666, resultado.getValor(0),0.000001);
		assertEquals(-0.5, resultado.getValor(1),0.000001);
		assertEquals(3.5, resultado.getValor(2),0.000001);
	}

	@Test
	void testDivide02a_VetoresTamanhosIguais() {
		VetorDeReais v = new VetorDeReais(3);
		v.setValor(2, 0);
		v.setValor(-1, 1);
		v.setValor(3.5, 2);

		VetorDeReais v2 = new VetorDeReais(3);
		v2.setValor(3, 0);
		v2.setValor(2, 1);
		v2.setValor(1, 2);
		
		VetorDeReais esperado = new VetorDeReais(3);
		esperado.setValor(0.66666666, 0);
		esperado.setValor(-0.5, 1);
		esperado.setValor(3.5, 2);
		
		VetorDeReais resultado = v.divide(v2);
		
		for (int i=0; i < esperado.getTamanho(); i++) {
			assertEquals(esperado.getValor(i), resultado.getValor(i),0.000001);
		}
	}

	@Test
	void testDivide02b_VetoresTamanhosIguais() {
		VetorDeReais v = new VetorDeReais(3);
		v.setValor(2, 0);
		v.setValor(-1, 1);
		v.setValor(3.5, 2);

		VetorDeReais v2 = new VetorDeReais(3);
		v2.setValor(3, 0);
		v2.setValor(2, 1);
		v2.setValor(1, 2);
		
		double[] esperado = {0.6666666, -0.5, 3.5};
		
		VetorDeReais resultado = v.divide(v2);
		
		for (int i=0; i < esperado.length; i++) {
			assertEquals(esperado[i], resultado.getValor(i),0.000001);
		}
	}
}
