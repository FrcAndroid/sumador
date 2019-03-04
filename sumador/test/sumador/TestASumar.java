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
	/**
	 * Este método hace lo mismo que el anterior, dando positivo si ambas cadenas estan vacías.
	 */
	public void testCifraNegativa() {
		ASumar s = new ASumar(-1);
		String resultado = s.mostrar2();
		assertEquals("", resultado);
	}
	/**
	 * Este método comprueba que la suma de cada dígito sea igual al esperado (1+7=8)
	 */
	public void testVariosDigitos() {
		ASumar s = new ASumar("17");
		int resultado = s.total(); 
		assertEquals(8, resultado);
	}


}
