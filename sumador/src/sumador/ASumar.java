package sumador;

public class ASumar {
	String valor_inicial;

	public ASumar(String string) {
		this.valor_inicial = string;
	}

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
