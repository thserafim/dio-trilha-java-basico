package iPhone;

public class telefone extends iphone {
	
	public void fazerChamada() {
		System.out.println("----------Telefone----------");
		
		System.out.println("Realizando chamada");
		encerrandoChamada();
	}
	public void atendendoChamada() {
		System.out.println("Atendendo chamada");
		encerrandoChamada();
	}
	private void encerrandoChamada() {
		System.out.println("Encerrando chamada");
	}
		
	

}
