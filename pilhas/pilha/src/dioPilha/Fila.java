package dioPilha;

public class Fila {
	
	private No refNoEntradaFila;

	public Fila() {
		this.refNoEntradaFila = null;
	}
	
	
	public void enqueue (No novoNo) {
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
	}
	
	//METODO FIRST VAI TRAZER O PRIMEIRO QUE ENTROU NA FILA
	
	public No first(){
		if(!this.isEmpty()) { //NEGANDO O ISEMPTY, SE A FILA NAO ESTA VAZIA, VOU RETORNAR O NO 
			No primeiroNo = refNoEntradaFila; // FILA COM UM UNICO NO
			
			while(true) { //TRANSFORMA O NO VERDADEIRO DE ALGUMA FORMA
				
				if(primeiroNo.getRefNo() != null){  //TESTE PARA SABER SE E O PRIMEIRO DA FILA SA NAO DA UM BREAK
					primeiroNo = primeiroNo.getRefNo(); 
				} else {
					break;
				}   
			}
		}
		return null; //SE NAO ESTIVER VAZIA
	}
	
	
	public No dequeue(){ // PARECIDO COM O FIRST
		if(!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila; 
			No noAuxiliar = refNoEntradaFila; 
			
			while(true) {
				
				if(primeiroNo.getRefNo() != null){  
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo(); 
				} else {
					
					noAuxiliar.setRefNo(null);
					break;
				}   
			}
			return primeiroNo;
		}
		return null;
	}
	
	public boolean isEmpty(){  
		  return  refNoEntradaFila == null ? true : false;            //SE A FILA ESTIVER VAZIA RETORNAMOS TRUE SE NAO FALSE
		}


	@Override
	public String toString() {
		String stringRetorno = "";
		No noAuxiliar = refNoEntradaFila;
		
		if(refNoEntradaFila != null) {
			while (true) {
				
			 stringRetorno += "[No{objeto=" + No.get.Object() + "}] -------->";
			 noAuxiliar = noAuxiliar.getRefNo();	
			}
		}else {
			stringRetorno = "null";
		}
		return stringRetorno;
	}
	
	
	}

