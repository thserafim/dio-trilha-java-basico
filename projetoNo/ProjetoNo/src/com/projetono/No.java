package com.projetono;

public class No <T> {  // ESSA É A CARA DO NO ESTRUTURA BASICA
	            // <T> = ACEITANDO UM TIPO GENERICO E TORNANDO A CLASSE NO GENERICA  
	private T conteudo; // AGORA NO DE QUALQUER TIPO
	private No<T> proximoNo; // ESPECIFICANDO QUE O PROXIMO NO TBM É DO MESMO TIPO
	
	public No(T conteudo) { // T = RECEBENDO O TIPO GENERICO 
		this.proximoNo = null;
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getProximoNo() { // OS CONTEUDOS DO NO ENCADEADO VAI SER SEMPRE DO TIPO T
		return proximoNo;
	}

	public void setProximoNo(No<T> proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	

}
// AGORA ESSA CLASSE NO ACEITA CONTEUDO DE QUALQUER TIPO GENERICO 