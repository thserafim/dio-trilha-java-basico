package encapsulamento;

public class Carro extends Veiculo{  //EXTENDS É O ASPECTO DA HERANCA E GARANTE A HERANCA DO CHASSI
	
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("CARRO LIGADO");
	}
// ENCAPSULANDO O MÉTODO !!
	
	private void confereCombustivel() {
		System.out.println("Conferindo Combustivel");	
	}
	private void confereCambio() {
		System.out.println("conferindo cambio em P");
	}

}
