package cl.awakelab.simulacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cl.awakelab.simulacion.calcularmontos.VentaExtra;

public class VentaExtraTest {

	@Test
	public void Test1() {
		VentaExtra ve = new VentaExtra(10,"RR","10/02/21",40000);
		assertEquals(ve.calcularMonto(),51600);
	}
	
	@Test
	public void Test2() {
		VentaExtra ve = new VentaExtra(15,"DD","12/02/21",50000);
		assertEquals(ve.calcularMonto(),67000);
	}
}
