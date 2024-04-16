package dio.exercicios.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class OrdenacaoConjunto {
	
	public static void main (String [] args) {
		
		System.out.println("--\t Ordem aleatória \t--");
		//CRIANDO O SET PARA MOSTRAR EM ORDEM ALEATORIA
		Set<Serie> minhasSeries = new HashSet<>(){{
			add(new Serie(got, "fantasia", 60));
			add(new Serie("Dark", "drama", 60));
			add(new Serie("OC", "acao", 25));
		}};
		for(Serie serie : minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero()+ " - " + serie.getTempoEpisodio());
	}
	
	//CRIANDO A CLASSE SERIE PARA RECEBER OS ATRIBUTOS
class Serie {
	
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	// CONSTRUINDO UM CONSTRUTOR
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
		}
	
	//GETTERS
	public String getNome() {
		return nome;
	}
	public String getGenero() {
		return genero;
	}
	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}
	
	
	//SUBSCREVENDO COM TOSTRING
	@Override
	public String toString() {
		return "[nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
		}
	
	
	//SUBSCREVENDO EQUALS AND HASHCODE
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getEnclosingInstance().hashCode();
		result = prime * result + Objects.hash(genero, nome, tempoEpisodio);
		return result;
	}
	@Override
	public boolean equals(Object obj) { //EQUALS QUE VAI FAZER A COMPARACAO
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
			return false;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}
	private OrdenacaoConjunto getEnclosingInstance() {
		return OrdenacaoConjunto.this;
	}
	
	
	}

}
