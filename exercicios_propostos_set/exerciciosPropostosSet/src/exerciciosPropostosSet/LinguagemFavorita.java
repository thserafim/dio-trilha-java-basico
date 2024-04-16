package exerciciosPropostosSet;

import java.util.Set;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// CLASSE E SEUS ATRIBUTOS JA RECEBENDO UM IMPLEMENTS/ COMPARABLE

class LinguagemFavorita implements Comparable <LinguagemFavorita> {
	
	private String nomeLinguagem;
	private int anoCriacao;
	private String IDE;
	
	//IMPLEMENTANDO O CONSTRUTOR DA CLASSE 
	
	public LinguagemFavorita(String nomeLinguagem, int anoCriacao, String iDE) {
		super();
		this.nomeLinguagem = nomeLinguagem;
		this.anoCriacao = anoCriacao;
		IDE = iDE;
	}
	
	//METODO PARA COMPARAR INSTANCIAS DA CLASSE
	@Override
	public int compareTo(LinguagemFavorita outraLinguagem) {
		//COMPARAÇAO PELO NOME DA LINGUAGEM                        
		return this.nomeLinguagem.compareTo(outraLinguagem.nomeLinguagem);
	}
	// TOSTRING PARA EXIBIR INFORMAÇOES DA INSTANCIA
	@Override
	public String toString() {
		return "[" + nomeLinguagem + ", Ano de Criacao: " + anoCriacao + ", IDE: " + IDE + "]"; }
	
	//METODO PRINCIPAL

	public static void main (String [] args) {
		
	Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();
	
	//ADICIONANDO AS LINGUAGENS/ANO/IDE AO CONJUNTO. REPARE QUE NAO É UMA ADIÇÃO APENAS COM ADD
	linguagens.add(new LinguagemFavorita("Java", 1995 ,"Eclipse"));
	linguagens.add(new LinguagemFavorita("Python", 1991 ,"Pycharm"));
	linguagens.add(new LinguagemFavorita("Golang", 2007 ,"VIM"));
	
	//ORDEM DE INSERÇÃO
	System.out.println("Ordem de insercao: ");
	for(LinguagemFavorita linguagem : linguagens) {
		System.out.println(linguagem);
	}
	
	//ORDEM ALFABETICA
	Set<LinguagemFavorita> ordemAlfa = new TreeSet <> (linguagens);
	System.out.println("\nOrdem de Alfabetica: ");
	for (LinguagemFavorita linguagem : ordemAlfa) {
		System.out.println(linguagem);
	}
	
	//ORDEM POR NOME IDE
	Set<LinguagemFavorita> ordemPorIDE = new TreeSet <> (Comparator.comparing(LinguagemFavorita::getIDE));
	ordemPorIDE.addAll(linguagens);
	System.out.println("\nOrdem de IDE: ");
	for (LinguagemFavorita linguagem : ordemPorIDE) {
		System.out.println(linguagem);
		
	//ORDEM POR ANO CRIAÇÃO
	Set<LinguagemFavorita> ordemPorAno = new TreeSet <> (Comparator.comparingInt(LinguagemFavorita::getAnoCriacao));
	ordemPorAno.addAll(linguagens);
	System.out.println("\nOrdem por ano criacao: ");
	for (LinguagemFavorita linguagem1 : ordemPorAno) {
		System.out.println(linguagem1);
	}
	
	//ORDENANDO POR NOME, ANO E IDE
	Set<LinguagemFavorita> ordemPorNomeAnoIDE = new TreeSet <> (Comparator
			.comparing(LinguagemFavorita::getNomeLinguagem)
			.thenComparingInt(LinguagemFavorita::getAnoCriacao)
			.thenComparing(LinguagemFavorita::getIDE));
	ordemPorNomeAnoIDE.addAll(linguagens);
	System.out.println("\nOrdem por nome, ano criacao e IDE: ");
	for (LinguagemFavorita linguagem2 : ordemPorNomeAnoIDE) {
		System.out.println(linguagem2);
	

			}
	
		}
	}
	
	//METODOS GET PARA ACESSAR VALORES PRIVADOS DOS ATRIBUTOS
	public String getNomeLinguagem() {
		return nomeLinguagem;
	}

	public int getAnoCriacao() {
		return anoCriacao;
	}

	public String getIDE() {
		return IDE;
	}
}
	
	


	
