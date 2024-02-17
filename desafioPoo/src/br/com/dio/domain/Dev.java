package br.com.dio.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public void inscreverBootCamp(BootCamp bootcamp) {
		
		this.conteudosIncritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevInscritos().add(this);
		
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosIncritos.remove(conteudo.get());
		}else {
			System.err.println("Se inscreva em algum conteudo");
		}
	}
	
	public double calcularTotalXp() {
		
		return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosIncritos() {
		return conteudosIncritos;
	}

	public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
		this.conteudosIncritos = conteudosIncritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override  //HASHCODE POIS ESTOU TRABALHANDO COM LINKEDHASHLIST
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosIncritos, nome);
	}

	@Override // EQUALS POIS ESTOU TRABALHANDO COM LINKEDHASHLIST
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosIncritos, other.conteudosIncritos) && Objects.equals(nome, other.nome);
	}
	
	

}
