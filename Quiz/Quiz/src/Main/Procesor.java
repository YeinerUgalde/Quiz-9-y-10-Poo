package Main;

public abstract class Procesor {
	
	protected Algoritmo algoritmo;
	
	public Procesor(Algoritmo pAlgoritmo) {
		this.algoritmo = pAlgoritmo;
	}
	
	protected abstract void procesar();
	
	
}
