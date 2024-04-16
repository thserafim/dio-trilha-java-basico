package dio.exercicios.set;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MetodosSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e add notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6)); 
        System.out.println(notas.toString()); //A IMPRESSAO VAI TRAZER UMA LISTA ALEATORIA JÁ QUE ESTAMPS TRABALHANDO CPM HASHSET, POREM NOTE QUE OS ELEMENTOS REPETIDOS DA LISTA SO ENTRARAM UMA VEZ
        
        //CONFERINDO SE TEM A NOTA USANDO O CONTAIS
        System.out.println("Confira se a nota 5 esta no conjunto: \n" + notas.contains(5.0));
        
        //EXIBINDO A MENOR NOTA, UTILIZO O COLLECTION.MIN
        System.out.println("Exibindo a menor nota: " + Collections.min(notas));
        
      //EXIBINDO A MAIOR NOTA, UTILIZO O COLLECTION.MAX
        System.out.println("Exibindo a menor nota: " + Collections.max(notas));
        
      //EXIBINDO A SOMA DOS VALORES
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
        	Double next = iterator.next();
        	soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        
        //EXIBINDO A MEDIA DAS NOTAS
        System.out.println("Exiba a media das notas: " + (soma/ notas.size()));
        
        //REMOVENDO A NOTA 0
        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);
        
        //REMOVENDO NOTAS MENORES QUE 7
        System.out.println("Remova as notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
        	Double next = iterator1.next();
        	if (next < 7) iterator1.remove();   
        }
        
        System.out.println(notas);
        
        // CREIANDO UMA NOVA LISTA
        System.out.println("Exiba todas as notas na ordem em foram informadas ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        
        System.out.println(notas2);
        
        // ORDEM CRESCENTE É NECESSARIO USAR O TREESET PARA FAZER A COMPARAÇÃO. CRIEI UMA NOVA LISTA NOTAS3 QUE VAI RECEBER O RESULTADO DA ORDEM CRESCENTE E USEI COMO REFERENCIA A NOTAS2
        System.out.println("Exiba todas as notas em ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        
        //APAGANDO TODO CONJUNTO
        System.out.println("Apague todo Conjunto: ");
        notas.clear();
        
        //USANDO ISEMPTY PARA SABER SE O CONJUNTO ESTA VAZIO
        System.out.println("Confirme se o Conjunto esta vazio: " + notas2.isEmpty());
    
    }

}
