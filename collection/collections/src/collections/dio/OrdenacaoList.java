package collections.dio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {
	
	public static void main (String [] args) {
		
		List<Gato> meusGatos = new ArrayList<>(){{
			add(new Gato("Jon ", " Preto ", 18));
			add(new Gato("Simba "," Tigrado ",6));
			add(new Gato("Jony ", " Amarelo ", 12));	
		}};
		System.out.println(meusGatos);
		
		System.out.println("--\t Ordem Aletoria\t--");
		Collections.shuffle(meusGatos); //SHUFFLE ORDENA ALEATORIAMENTE
		System.out.println(meusGatos);
		
		System.out.println("-- \t Ordem Natural (Nome)\t --");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("-- \t Ordem Idade\t --");
		Collections.sort(meusGatos, new ComparatorIdade() );
		meusGatos.sort(new ComparatorIdade());
	}

}

class Gato implements Comparable<Gato> {
	
	private String nome ;
	private int idade ;
	private String cor ;
	public Gato(String nome, String cor, int idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "[nome = " + nome + ", idade = " + idade + ", cor = " + cor + "]";
	}
	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
class ComparatorIdade implements Comparator <Gato> {
	@Override
	public int compare(Gato g1, Gato g2) {
			return Integer.compare(g1.getIdade(), g2.getIdade());
		}
	}
		
	
}
