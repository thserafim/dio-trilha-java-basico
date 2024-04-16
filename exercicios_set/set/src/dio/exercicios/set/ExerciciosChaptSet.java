package dio.exercicios.set;

/*Escreva um programa que recebe uma lista de números inteiros e usa um conjunto para remover
 * todas as duplicatas, exibindo a lista sem repetições.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class ExerciciosChaptSet {
	
	public static void main (String [] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(2);
		
		System.out.println("Lista de numeros: " + lista);
		
		Set<Integer> lista2 = new HashSet<>(lista);
		List<Integer> listaSemDupli = new ArrayList<>(lista2);
		
		System.out.println("Lista sem duplicata" + lista2);
	}

}
