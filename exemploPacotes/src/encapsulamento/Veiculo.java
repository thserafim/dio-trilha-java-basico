package encapsulamento;
// VEICULO PASSA A TER O CHASSI 
public abstract class Veiculo { //ABSTRACT É A ABSTRAÇÃO, ou seja eu não sei como as coisas acontecem// 
	
	private String chassi;
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public abstract void ligar();// o carro ja tem p metodo ligar, precisa implementar na moto pq nao sei como  as coisas acontecem. TODOS ELES TEM O METODO LIGAR QUE VEIO DO VEICULO

}
