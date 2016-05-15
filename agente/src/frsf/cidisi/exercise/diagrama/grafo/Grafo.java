package frsf.cidisi.exercise.diagrama.grafo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Grafo {
	
	ArrayList<Nodo> grafo = new ArrayList<Nodo>();

	public Grafo(){
		
	}
	public ArrayList<Nodo> agregarNodoAGrafo(Nodo nodo){
		grafo.add(nodo);
		
		return grafo;
	}
	
	//REVEER ESTA FUNCION
	public Nodo getNodo(String nombre){
		Nodo nodoEncontrado = new Nodo();
		
		for(Nodo nodo: grafo){
			if(nodo.getNombre() == nombre){
				return nodo;
			}
		}
		return nodoEncontrado;
	}
	
}
