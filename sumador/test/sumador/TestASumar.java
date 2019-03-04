package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	@Test
	public void testCifraNegativa() {
		ASumar s = new ASumar(-1);
		String resultado = s.mostrar();
		assertEquals("", resultado);
	}

}
