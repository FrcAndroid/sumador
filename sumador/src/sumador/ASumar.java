package sumador;

public class ASumar {
	int valor_inicial;

	public ASumar(int i) {
		this.valor_inicial = i;
		
	}

	public String mostrar() {
		int numero = valor_inicial;
		String resultado;
		if (numero < 0) {
			resultado = "";
		}
		else {
			resultado = "("+ numero + " == " + numero +")";
		}
		return resultado;
		
	}
	
	

}
