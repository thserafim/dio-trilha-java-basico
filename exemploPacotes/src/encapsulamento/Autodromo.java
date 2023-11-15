package encapsulamento;

public class Autodromo {
	
	public static void main (String args []) {
		Carro jeep = new Carro();
		// ESCONDI AS ACOES CONFERI CAMBIO E COMBUSTIVEL
		jeep.setChassi("897897");
		jeep.ligar();
	   // APENAS PRECISEI CHAMAR O METODO LIGAR !!
		
		
	   // AQUI TEMOS UM POLIMORFISMO POIS TEMOS UMA OUTRA FORMA DE LIGAR 
		Moto z400 = new Moto ();
		z400.setChassi("467754");
		z400.ligar();
	}

}
