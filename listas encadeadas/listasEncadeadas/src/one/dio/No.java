package one.dio;

public class No <T> { //UTILIZANDO GENERICS
	
	private T conteudo; //TIPO T É CONTEUDO GENERICO.
	private No proximoNo;

	public No() { // CONSTRUTOR VAZIO
		this.proximoNo = null;
		
	}

	public No(T conteudo) {// CONSTRUTOR PASSANDO O CONTEUDO
		this.proximoNo = null;
		this.conteudo = conteudo;
	}

	public No(T conteudo, No proximoNo) { //USANDO O CONSTRUTOR USANDO OS DOIS PARAMETROS DA CLASSE NO
		this.conteudo = conteudo;
		this.proximoNo = proximoNo;
	}
	
	// CRIANDO GETTERS AND SETTERS

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}
	// CRIANDO UM METODO TOSTRING

	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	// CRIANDO METODO PERSONALIZADO TOSTRING
	
	public String toStringEncadeado() {
		String str = "No [conteudo=" + conteudo + "]";
		
		if(proximoNo != null) {
			str += "->" + proximoNo.toString();
		} else {
			str += "->null";
		}
		return str;
	}
	
	

}
