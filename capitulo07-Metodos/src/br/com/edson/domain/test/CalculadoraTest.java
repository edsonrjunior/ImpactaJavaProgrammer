package br.com.edson.domain.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.edson.domain.Calculadora;

class CalculadoraTest {

	Calculadora c;
	
	@BeforeEach
	void setUp() throws Exception {
		c = new Calculadora();
	}

	@Test
	void testSomarLongArray() {
		assertEquals(10, c.somar(5,5));
	}

	@Test
	void testMultiplicar() {
		assertEquals(9, c.multiplicar(3, 3));
	}

	@Test()
	void testDividir() {
		assertEquals(5, c.dividir(25, 5));
	}
	
//	@Test (expected = ArithmeticException.class)
//	void testDividirPorZero() {
//		//Erro
//		assertEquals(5, c.dividir(25, 0));
//	}

}
