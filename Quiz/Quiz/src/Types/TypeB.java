package Types;

import Main.Algoritmo;
import Main.Procesor;

public class TypeB extends Procesor {

	public TypeB(Algoritmo pAlgoritmo) {
		super(pAlgoritmo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void procesar() {
		System.out.print("Subtitulos del video en algun idioma ");
		algoritmo.getResult();
	}

}
