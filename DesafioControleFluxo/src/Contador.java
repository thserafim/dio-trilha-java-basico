import java.util.Scanner;

class ParametrosInvalidosExeception extends Exception{
    public ParametrosInvalidosExeception(String mensagem){
        super(mensagem);
    }
}
public class Contador {
    public static void main (String args []){
        Scanner terminal = new Scanner (System.in);
        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();
    

        try{ 
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosExeception e){
            System.out.println("Erro: O segundo parametro deve ser maior que o primeiro " + e);

    }
}
static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosExeception{
        if (parametroUm > parametroDois){
             throw new ParametrosInvalidosExeception("O segundo parametro deve ser maior que o primeiro");
        }
            int contagem = parametroDois - parametroUm;
            for (int i = 0; i <= contagem; i++){
                System.out.println(parametroUm + i);
            }
        
    }

} 


