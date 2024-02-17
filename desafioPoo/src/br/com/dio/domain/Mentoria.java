package br.com.dio.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	

	private LocalDate data;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20;
	}
	
	//CRIACAO DO CONSTRUTOR VAZIO
	
	public Mentoria() {
		super();
	}
	//GETS AND SETTER BECAUSE USE ACESS MODIFY PRIVATE
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	//CREATE TOSTRING FOR PRESS 
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}
	
	
}
