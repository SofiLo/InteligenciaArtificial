package frsf.cidisi.exercise.diagrama.grafo;

import java.util.ArrayList;

public class Grafo {
	
	ArrayList<Nodo> grafo = new ArrayList<Nodo>();
	
	public Grafo(){
		
	}
	public ArrayList<Nodo> agregarNodoAGrafo(Nodo nodo){
		grafo.add(nodo);
		
		return grafo;
	}
	
}
