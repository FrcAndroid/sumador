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
	

}
