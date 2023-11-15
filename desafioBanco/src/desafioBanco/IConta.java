package desafioBanco;

public interface IConta {
	// NAO PRECISA DECLARAR PUBLIC NA INTERFACE, APENAS O VOID
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
	
	

}
