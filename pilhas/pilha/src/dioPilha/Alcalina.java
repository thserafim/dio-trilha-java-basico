package dioPilha;


import java.util.Stack;

public class Alcalina { // ESTRUTURA SIMPLES DE PILHA
	
	public static void main (String args []) {
		Stack <Integer> pilha = new Stack<>(); //INICIANDO UMA PILHA VAZIA 
		
		pilha.push(5);
		pilha.push(10);
		pilha.push(3);
		
		System.out.println("Topo da pilha: " + pilha.peek()); // O QUE É O PEEK?? PERMITE QUE VC EXECUTE UMA AÇAO SEM MODIFICAR OS ELEMENTOS DO FLUXO. REPRESENTA UMA EXPRESSAO LAMBDA OU METODO. É UTILIZADO NO PROCESSO DE FLUXO
		
		//DESEMPILHANDO
		pilha.pop();
		
		//IMPRIMINDO O TOPO DA PILHA APOS DESEMPILHAR
		System.out.println("Topo da pilha apos desempilhar: " + pilha.peek());
		
		//EMPILHANDO NA PILHA 7
		pilha.push(7);
		
		System.out.println("Topo da pilha apos empilhar 7: " + pilha.peek());
		
		System.out.println("Tamanho da pilha: " + pilha.size());
		
		
		
		
	}

}
