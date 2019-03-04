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
	 * @param string -> El objeto se construye a partir de un �nico elemento tipo String
	 */
	public ASumar(String string) {
        this.valor_inicial = string;
        
	}
	/**
	 * Este m�todo devuelve una cadena de car�cteres para usar en las clases Test siempre que la longitud del n�mero, que toma el valor inicial anteriormente definido
	 * sea de 1 d�gito.
	 * @return Cadena de car�cteres que se iguala con la clase Test
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
	 * A diferencia del m�todo mostrar anterior, este m�todo requiere un objeto de clase int, por lo que si el n�mero es negativo, devolver� una cadena vac�a.
	 * @return Cadena de car�cteres que se usar� en el Test.
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
	 * Este m�todo usa un n�mero en forma de cadena de car�cteres y usa un bucle for para recorrer cada d�gito y sumarlos, almacenandose en el valor suma. 
	 * @return valor final de suma al terminar el bucle for, suma de todos los d�gitos individuales del n�mero.
	 */
	public int total() {
		int suma = 0;
		
		for(int i = 0; i< valor_inicial.length(); i++) {
			// Cadena de un d�gito.
			String digito = valor_inicial.substring(i, i+1);
			suma = suma + Integer.parseInt(digito);
		}
		return suma;
	}


	
}
