package collections.dio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ExemploList {
	
	public static void main (String[] args) {
		
		List<Double> notas = new ArrayList <Double>();
		
		System.out.println("Crie uma ista e adicione valores:");
		
		notas.add(1.0);
		notas.add(2.0);
		notas.add(2.4);
		notas.add(6.7);
		notas.add(9.0);
		
		System.out.println(notas);
		System.out.println(notas.toString());//IMPRIMINDO USANDO toString().
		System.out.println("Exiba a posicao da nota 6.7: " + notas.indexOf(6.7));//IMPRIMINDO A POSIÇÃO DO ELEMENTO NA LISTA.
		System.out.println("Adicione na lista a nota 8.0 na posicao 4: ");
		notas.add(4, 8.0); // ADICIONANDO NOTAS EM POSICOES ESPECIFICAS
		System.out.println(notas);
		System.out.println("subistituindo a nota 2 pela nota 1.3");
		notas.set(notas.indexOf(2.0), 1.3);//UTILIZANDO O SET PARA SUBSTITUIR POSICOES ESPECÍFICAS
		System.out.println(notas);
		System.out.println("Confira se a nota 9.0 esta na lista: " + notas.contains(9.0) ); //O METODO CONTAINS MOSTRA SE O ELEMNTO ESTA NA LISTA
		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		System.out.println(notas.toString());
		System.out.println("Exiba a menor nota: " + Collections.min(notas));// EXIBINDO A MENOR NOTA PQ O DOUBLE IMPLEMENTA A INTERFACE COMPARABLE
		//PARA A MAIOR NOTA UTILIZAMOS O MAX
		
		Iterator<Double> iterator = notas.iterator();
		double soma = 0.0;
		while(iterator.hasNext()) {                //FAZENDO A SOMA DOS VALORES DA LISTA
			double next = iterator.next();
			soma += next;
		}
		System.out.println("Exiba a soma dos valores: " + soma);
		System.out.println("Exiba a media das notas: " + (soma/notas.size()));
		System.out.println("Remova a nota 1: ");
		notas.remove(1.0);                         //METODO REMOVE PARA REMOVER
		System.out.println(notas);
		System.out.println("Remova a nota na posicao 1: ");
		notas.remove(1);
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();  //REMOVENDO VALORES DE PONTO DE CORTE
			if(next <7) iterator1.remove();
		}
		System.out.println(notas);
		
	}
}

/* EXEMPLO COM FOR
public class ExemploList {
	
	public static void main (String[] args) {
		
		System.out.println("Crie uma lista e adicione valores: ");
		
		List<Double> notas = new ArrayList<Double>();
		
		for(double i = 1.0; i <= 7.0; i++) {
			
			notas.add(i);
			
			System.out.println(notas);
			
		}
		
		
	}

}*/
