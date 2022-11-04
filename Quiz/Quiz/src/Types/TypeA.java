package Types;

import Main.Algoritmo;
import Main.Procesor;

public class TypeA extends Procesor {


	public TypeA(Algoritmo pAlgoritmo) {
		super(pAlgoritmo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void procesar() {
		System.out.print("Reproduce una descripcion del video ");
		algoritmo.getResult();
	}
	
	
}
