package one;

public class fila {
	
	private No refNoEntradaFila;

	public fila() {
		this.refNoEntradaFila = null;
	}
	
	public void enqueue(No novoNo) {
		
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
		
	}
	
	public void first(){
		if(!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			while (true) {
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();					
				}else {
					break;
				}
			}
		}
		return;
	}
	
	public void dequeue(){
		if(!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			No noAuxiliar = refNoEntradaFila;
			while (true) {
				if(primeiroNo.getRefNo() != null) {
					noAuxiliar
					primeiroNo = primeiroNo.getRefNo();					
				}else {
					break;
				}
			}
		}
		return;
	}
	
	public boolean isEmpty() {
		return refNoEntradaFila == null? true:false;
	}
	
}
