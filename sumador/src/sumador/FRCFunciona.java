package sumador;

public class FRCFunciona {

	public static void main(String[] args) {
		ASumar suma = new ASumar("1");
		
		System.out.println(suma.mostrar());
		
		ASumar suma2 = new ASumar(-1);
		
		System.out.println(suma2.mostrar2() + " <- Esto es una cadena vacía");
		
		ASumar suma3 = new ASumar("89342419");
		
		System.out.println("8+9+3+4+2+4+1+9= " + suma3.total() );
	}

}
