package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {
	/**
	 * Este método usa el método mostrar de la clase ASumar para igualar dos cadenas de carácteres, y da positivo si estas dos cadenas son iguales.
	 */
	@Test
	public void testUnDigito() {
		ASumar s = new ASumar("7");
        String resultado = s.mostrar();
        assertEquals("7 = 7",resultado );
    }

}
