package dioExerciciosMap;

import java.util.Map;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class ExemploMap {
	
	public static void main (String [] args) {
		
		System.out.println("Crie um dicionario e relacione modelos e consumo: ");
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("GOL", 14.4); //NOTE QUE UTILIZAMOS O PUT AO INVES DO ADD
			put("UNO", 15.4);
			put("PASSAT", 12.9);
			put("SAVERO", 11.7);
			put("FOX", 14.3);
		}};
		System.out.println(carrosPopulares.toString());
		
		
		//CONTAINSKEY = VAI DIZER SE EXISTE O ELEMENTO NA LISTA
		System.out.println("Confira se Fusca esta na lista: " + carrosPopulares.containsKey("Fusca"));
		
		//SUBSTITUIÇAO DE ELEMENTO
		System.out.println("Substituindo o consumo do gol por 17,2 KM/L: ");
		carrosPopulares.put("GOL", 17.2);
		System.out.println(carrosPopulares);
		
		//GET -> PASSANDO A CHAVE E RETORNANDO O VALOR
		System.out.println("Exiba o consumo do UNO: " + carrosPopulares.get("UNO"));
		
		//METODO KEYSET ( O KEYSET RETORNA UM SET)
		System.out.println("Exiba os modelos: ");
		Set <String> modelos = carrosPopulares.keySet();
		System.out.println(modelos);
		
		//UTILIZANDO O METODO VALUES (É NECESSARIO USAR COLLECTION)
		System.out.println("Exiba o consumo: ");
		Collection <Double> consumos = carrosPopulares.values();
		System.out.println(consumos);
		
		//RETORNANDO O MAIOR VALOR DE CONSUMO, NECESSARIO UTILIZAR COLLECTIONS, ENTRYSET QUE VAI RETORNAR O SET
		System.out.println("Exiba o modelo mais economico e seu consumo: ");
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMaisEficiente = "";
		
		for (Map.Entry<String, Double> entry : entries) {
			if (entry.getValue().equals(modeloMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);}
		}
		
	}

}
