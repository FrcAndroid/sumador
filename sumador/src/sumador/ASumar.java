package sumador;
/**
 * 
 * @author Francis
 * @version 1.0
 *
 */
public class ASumar {
	String valor_inicial;

	/**
	 * Al construir el objeto ASumar, la variable valor_inicial toma el valor del string
	 * @param string -> El objeto se construye a partir de un único elemento tipo String
	 */
	public ASumar(String string) {
        this.valor_inicial = string;
        
	}
	/**
	 * Este método devuelve una cadena de carácteres para usar en las clases Test siempre que la longitud del número, que toma el valor inicial anteriormente definido
	 * sea de 1 dígito.
	 * @return Cadena de carácteres que se iguala con la clase Test
	 */
	public String mostrar() {
		String numero = valor_inicial;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }	
        else {
        	return null;
        }
	}

	int valor_inicial2;

	public ASumar(int i) {
		this.valor_inicial2 = i;
		
	}
	/**
	 * A diferencia del método mostrar anterior, este método requiere un objeto de clase int, por lo que si el número es negativo, devolverá una cadena vacía.
	 * @return Cadena de carácteres que se usará en el Test.
	 */

	public String mostrar2() {
		int numero = valor_inicial2;
		String resultado;
		if (numero < 0) {
			resultado = "";
		}
		else {
			resultado = "("+ numero + " == " + numero +")";
		}
		return resultado;
		
	}

	/**
	 * Este método usa un número en forma de cadena de carácteres y usa un bucle for para recorrer cada dígito y sumarlos, almacenandose en el valor suma. 
	 * @return valor final de suma al terminar el bucle for, suma de todos los dígitos individuales del número.
	 */
	public int total() {
		int suma = 0;
		
		for(int i = 0; i< valor_inicial.length(); i++) {
			// Cadena de un dígito.
			String digito = valor_inicial.substring(i, i+1);
			suma = suma + Integer.parseInt(digito);
		}
		return suma;
	}


	
}
