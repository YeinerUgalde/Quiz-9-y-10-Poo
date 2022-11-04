package Main;

import Algoritmos.*;

import Types.*;

public class Main {

	public static void main(String[] args) {
		
		Algoritmo algoritmo1 = new Algoritmo2(); 
		Procesor proceso1 = new TypeB(algoritmo1);
		
		proceso1.procesar();
		
	}

}
