import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContribuinteTest {

	@Test
	void test06SetUFComoSC() {
		Contribuinte c = new Contribuinte();
		c.setUf("SC");
		assertEquals("SC", c.getUf());
	}

	@Test
	void test07SetUFComoPR() {
		Contribuinte c = new Contribuinte();
		c.setUf("PR");
		assertEquals("PR", c.getUf());
	}

	@Test
	void test08SetUFComoRS() {
		Contribuinte c = new Contribuinte();
		c.setUf("RS");
		assertEquals("RS", c.getUf());
	}

	@Test
	void test09SetUFComoSP() {
		Contribuinte c = new Contribuinte();
		c.setUf("SP");
		assertEquals(null, c.getUf());
	}

	@Test
	void test10SetUFComoRJ() {
		Contribuinte c = new Contribuinte();
		c.setUf("RJ");
		assertEquals(null, c.getUf());
	}

	@Test
	void test05_SetRendaAnualNegativa() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(-818.50);
		assertEquals(0, c.getRendaAnual());
	}

	@Test
	void test01CalcularImposto_3000_impostoZero() {
		// triple A
		// Arrange
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(3000);

		// Act
		double imposto = c.calcularImposto();

		// Assert
		assertEquals(0, imposto);
	}

	@Test
	void test02CalcularImposto_9000_imposto522() {
		// Arrange
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(9000);

		// Act & Assert
		assertEquals(522.0, c.calcularImposto());
	}

	@Test
	void test03CalcularImposto_10000_imposto1500() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(10000);

		double imposto = c.calcularImposto();

		assertEquals(1500.0, imposto);
	}

	@Test
	void test04CalcularImposto_34911_73_imposto9600_72() {
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(34911.73);

		double imposto = c.calcularImposto();

		assertEquals(9600.72, imposto, 0.009);
	}

}
