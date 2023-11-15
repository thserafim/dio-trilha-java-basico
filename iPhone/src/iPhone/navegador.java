package iPhone;

public class navegador extends iphone {
	
	public void abrirPagina() {
		System.out.println("----------Nagevador----------");
		verificarConexao();
		System.out.println("Google pesquisa: ______");
		
	}
	public void adicionarAba() {
		System.out.println("https:// ");
		
	}
	
	public void atualizar() {
		System.out.println("Atualizando... ");
		
	}
	
	private void verificarConexao() {
		System.out.println("Conectado a internet");
	}
		
	

}
