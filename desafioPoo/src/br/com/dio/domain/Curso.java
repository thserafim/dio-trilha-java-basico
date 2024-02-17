package br.com.dio.domain;

public class Curso extends Conteudo {
	
	private int cargaHoraria;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	//CRIACAO DO CONSTRUTOR VAZIO
	
	public Curso() {
		super();
	}
	//GETS AND SETTER BECAUSE USE ACESS MODIFY PRIVATE
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	//CREATE TOSTRING FOR PRESS
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
	
	
}
