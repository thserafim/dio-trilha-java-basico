/*import java.util.Scanner;

public class Exercicios {

    public static void main (String args []){
        Scanner teclado = new Scanner (System.in);
        double saldo = teclado.nextInt();
        double valorSolicitado = teclado.nextInt();

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);

        teclado.close();;

    }
    
}

import java.util.Scanner;

public class Exercicios{
    public static void main (String args []){
    
        Scanner teclado = new Scanner (System.in);
        int nota = teclado.nextInt();

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7 )
            System.out.println("Recuperacao");
        else
            System.out.println("Reprovado");
    }
}


//  ------------------------------      CONDICAO TERNARIA  ------------------------------------------------------------

import java.util.Scanner;

public class Exercicios{

    public static void main (String args []){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da nota: ");
        int nota = teclado.nextInt();
        String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperacao" : "Reprovado";

        System.out.println(resultado);

        teclado.close();
    }
}


//        --------------------------------------------  SWITCH CASE  ------------------------------------------------------------------

import java.util.Scanner;

public class Exercicios {
    public static void main (String args []){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite a opcao de plano (T, M or B): ");
        String plano = teclado.nextLine();

        switch (plano) {
            case "T": {
                System.out.println("5 GB Youtube");
                break;
            }

            case "M": {
                System.out.println("Whats e Instagram gratis");
                break;
            }

            case "B": {
                System.out.println("100 minutos de ligacao");
                break;
            }

            default:
                System.out.println("Plano nao encontrado");
        } 
    } 
}


// ----------------------------------ESTRUTURAS DE REPETICAO --------------------------------------------------------------------

public class Exercicios {
    public static void main (String args []){

        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++){
            System.out.println( carneirinhos + " -  Carneirinhos ");
        }
    }

}


public class Exercicios {
    public static void main (String args []){
        String alunos [] = {"FELIPE","LONAS","JULIA","MARCOS"};
        
        for (int x = 0; x < alunos.length; x ++){
            System.out.println("Aluno no indice x = " + x + " é " + alunos[x]);
        }
    }
}



public class Exercicios {

    public static void main (String args [])
    {
        for (int numero = 0; numero <= 5; numero ++){
            if(numero == 3)
                break;

            System.out.println(numero);
        }

    }

}


import java.util.concurrent.ThreadLocalRandom;
public class Exercicios {
    public static void main (String args [])
    {
        double mesada = 50.0;
        while (mesada >0){
            double valorDoce = valorAleartorio();

            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joaozinho gastou toda a sua mesada em doces");

    }
    private static double valorAleartorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}


//----------------------------------------------------- TRATAMENTO DE EXCEÇOES ---------------------------------------------------------

import java.util.Locale;
import java.util.Scanner;

public class Exercicios{
    public static void main (String args []){

        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sue nome: ");
        String nome = teclado.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobreNome = teclado.next();

        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = teclado.nextDouble();

        System.out.println("Ola, me chamo " +  nome.toUpperCase() + " " + sobreNome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é: " + altura + " cm ");

        teclado.close();
    }
}

public class Exercicios extends Exception {
   static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() !=8)
            throw new CepInvalidoException();

            return "23.765-064";
    }
}*/


import java.util.Scanner;

public class Exercicios {

    public static void main(String [] args){
        Scanner teclado = new Scanner (System.in);

        int C = teclado.nextInt();
        String nome;
        int N;

    for (int i = 0; i <  C; i ++ ) {

        nome = teclado.next();
        N = teclado.nextInt();
        if (nome.equals("Thor")) System.out.println("Y");
        else System.out.println("N");
    }
 }
 
}