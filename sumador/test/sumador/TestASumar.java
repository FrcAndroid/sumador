package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	@Test
	public void testVariosDigitos() {
		ASumar s = new ASumar("17");
		int resultado = s.total(); 
		assertEquals(8, resultado);
	}

}
