package com.projetono;

public class Main {
	
	public static void main(String args []) {
		
		No<String> no1 = new No<>("Conteudo no1");
		
		No<String> no2 = new No<>("Conteudo no2");
		no1.setProximoNo(no2); // NO 1 APONTANDO PARA NO 2	
		
		No<String> no3 = new No <>("Conteudd no3");
		no2.setProximoNo(no3); // NO 2 APONTANDO PARA O NO 3
		
		No<String> no4 = new No<>("Conteudo no4");
		no3.setProximoNo(no4); // NO 3 APONTABDO PARA O NO 4
		
		                      // NO 4 APONTA PARA NULL
		// TODO O PROGRAMA FOI AMARRADO PARA UM NO DE STRING 
		System.out.println(no1);
		System.out.println(no1.getProximoNo()); // NO 1 PRINTANDO O NO 2
		System.out.println(no2);
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo()); // NO 1 PRINTANDO O NO 2, NO 2 PARA O 3, NO 3 PARA O NO 4, NO 4 PARA NULL
				
	}

}
