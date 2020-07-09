package principal;

public class Pruebas {

	public static void main(String[] args) {
		System.out.println("PRUEBAS");
		String cad="esto es una cadena";
		char letra='a';
		System.out.println(cad.indexOf(letra));
		
		String numero="3562,45";
		String numeroFinal=numero.replace(",", ".");
		System.out.println(numeroFinal);

		String nombres="uno,dos,tres,cuatro";
		//m�todo split
		String[] datos=nombres.split(",");
		
	}

}
