import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco Dio\n");

        System.out.println("Digite o número da conta: ");
        int numeroConta = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digite o número da agência: ");
        String numeroAgencia = teclado.nextLine();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = teclado.nextLine();
        System.out.println("Digite o valor do depósito inicial: ");
        double saldoInicial = teclado.nextDouble();

        System.out.println("Olá " + nomeCliente + " sua conta foi criada com sucesso! \n Sua agência é: " + numeroAgencia + ", sua conta é: " + numeroConta + ", e seu saldo inicial é: " + saldoInicial);
       
    }
}
