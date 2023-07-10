import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class processoSeletivo {

    public static void main (String [] args){
         String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
         for (String candidato: candidatos){
            entrandoEmContato(candidato);
         }
        
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender ();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato Realizado Com Sucesso!!");

        }while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas );
        else 
            System.out.println("Nao conseguimos contato com " + candidato + ", tentativas excedidas");
    }

    //metidi auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){

         String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};

         for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
         }

    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("Candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("Candidato " + candidato + " selecionado para a vaga");
                candidatosSelecionados ++;
            }
            candidatoAtual ++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidatos(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato e fechar contratacao");
        }else if (salarioBase == salarioPretendido )
            System.out.println("Ligar para o candidato, confirmar a proposta e fechar contratacao");
        else {
            System.out.println("Ligar para o candidato e informar contra proposta");
        }
    }
}
