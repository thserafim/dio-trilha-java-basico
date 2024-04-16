package exerciciosPropostosSet;

import java.util.Set;
import java.util.TreeSet;

public class CoresArcoIris {
	
	public static void main (String [] args) {
		//CRIANDO A LISTA DE CORES
		Set<String> coresArcoIris = new TreeSet <>();
		
		coresArcoIris.add("Vermelho");
		coresArcoIris.add("Verde");
		coresArcoIris.add("Amarelo");
		coresArcoIris.add("Laranja");
		coresArcoIris.add("Azul");
		coresArcoIris.add("Roxo");
		coresArcoIris.add("Anil");
		
		//IMPRIMINDO AS CORES UMA ABAIXO DA OUTRA
		System.out.println("Imprimindo as cores uma abaixo da outra: ");
		exibirCores(coresArcoIris);
		
		//EXIBINDO CORES EM ORDEM ALFABETICA
		System.out.println("\nCores em ordem alfabetica: ");
		exibirCores(ordemAlfabetica(coresArcoIris));
		
		// EXIBINDO CORES ORDEM INVERSA
		System.out.println("\nCores ordem inversa: ");
		exibirCores(ordemInversa(coresArcoIris));
		
		//EXIBINDO CORES INICIA CM V
		System.out.println("\nCores que iniciam com V: ");
		exibirCores(letrav(coresArcoIris, "V"));
		
		// REMOVE CORES QUE NAO COMEÇAM COM V
		removeSemV(coresArcoIris, "V");
		System.out.println("\nCores apos remover as que nao comecam com V");
		exibirCores(coresArcoIris);
		
		//LIMPANDO A LISTA DE CORES
		limparLista(coresArcoIris);
		System.out.println("\nConjunto apos limpar: ");
		exibirCores(coresArcoIris);
		
		//VERIFICAR SE O CONJUNTO TA VAZIO
		System.out.println("\nConjunto esta vazio ? " + conjuntoVazio(coresArcoIris));
		
	}
	
	//METODO PARA EXIBIR AS CORES
	private static void exibirCores (Set <String> cores) {
		for(String cor : cores) {
			System.out.println(cor);
		}
	}
	
	// METODO ORDEM ALFABETICA
	private static Set<String> ordemAlfabetica (Set <String> cores){
		return new TreeSet <> (cores);
	}
	
	//METODO CORES ORDEM INVERSA
	private static Set<String> ordemInversa (Set<String> cores){
		Set <String> coresInversa = new TreeSet<>(cores).descendingSet(); //DESCENDINGSET DA A ORDEM REVERSA
		return coresInversa;
	}
	// METODO INICIAL LETRA V
	private static Set <String> letrav (Set <String> cores, CharSequence V) {
		Set <String> filtro = new TreeSet <>();
		for(String cor : cores) {
			if (cor.startsWith(String.valueOf(V))) {
				filtro.add(cor);
			}
		}
		return filtro;
		
	}
	
	// METODO REMOVENDO AS CORES QUE NAO COMECAM COM V
	private static void removeSemV (Set<String> cores, CharSequence V) {
		cores.removeIf(cor -> !cor.startsWith(String.valueOf(V)));
	}
	
	private static void limparLista (Set<String> cores) {
		cores.clear();
	}
	
	private static boolean conjuntoVazio(Set<String> cores) {
		return cores.isEmpty();
	}

	
}