package cl.awakelab.simulacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cl.awakelab.simulacion.calcularmontos.VentaDiaria;


public class VentaDiariaTest {

	@Test
	public void test1() {
		VentaDiaria vd = new VentaDiaria(6000,"CC","10/02/21",55000);
		assertEquals(vd.calcularMonto(),71450);
	} 
	
	@Test
	public void test2() {
		VentaDiaria vd = new VentaDiaria(7500,"OO","11/02/21",70000);
		assertEquals(vd.calcularMonto(),90800);
	} 
}
