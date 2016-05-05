package frsf.cidisi.exercise;

import java.util.HashMap;

import frsf.cidisi.exercise.diagrama.grafo.Nodo;

public class Inicializacion {
	
	public static void inicializacion(){
		
		//Creamos los nodos
		Nodo nodoInicial = new Nodo();
		Nodo nodoCantina = new Nodo();
		Nodo nodoPuertaPpal = new Nodo();
		
		//Seteamos los nodos
		nodoInicial.setNombre("Mastil");
		nodoInicial.setIdNodo(0);
		nodoInicial.setNivel(0);
		nodoInicial.setObstaculo(false);
		
		nodoCantina.setNombre("Cantina");
		nodoCantina.setIdNodo(1);
		nodoCantina.setNivel(0);
		nodoCantina.setObstaculo(false);
		
		nodoPuertaPpal.setNombre("Puerta Principal");
		nodoPuertaPpal.setIdNodo(2);
		nodoPuertaPpal.setNivel(0);
		nodoPuertaPpal.setObstaculo(false);
		
		nodoInicial.agregarDestinos(Constantes.NORTE, nodoCantina);
		nodoInicial.agregarDestinos(Constantes.SUR, nodoPuertaPpal);
		
		

	} 
}
