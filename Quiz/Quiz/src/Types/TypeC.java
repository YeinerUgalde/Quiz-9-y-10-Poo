package Types;

import Main.Algoritmo;
import Main.Procesor;

public class TypeC extends Procesor{

	public TypeC(Algoritmo pAlgoritmo) {
		super(pAlgoritmo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void procesar() {
		System.out.print("Traduccion del video a algun idioma ");
		algoritmo.getResult();
	}

}
