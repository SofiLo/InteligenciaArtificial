package frsf.cidisi.exercise.diagrama.grafo;

import java.util.HashMap;

public class Nodo {
	private String nombre;
	private int idNodo;
	private int nivel;
	private boolean obstaculo = false;
	private HashMap<String, Nodo> destinos = new HashMap<String, Nodo>();
	private HashMap<String, Integer> distancias = new HashMap<String, Integer>();

	public Nodo() {
		nombre = "1000";
		nivel = 1000;
		idNodo = 1000;
	}

	public Nodo(String nombre, int idNodo, int nivel, boolean obstaculo) {
		this.nombre = nombre;
		this.idNodo = idNodo;
		this.nivel = nivel;
		this.obstaculo = obstaculo;
	}

	public int getIdNodo() {
		return idNodo;
	}

	public void setIdNodo(int idNodo) {
		this.idNodo = idNodo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public boolean isObstaculo() {
		return obstaculo;
	}

	public void setObstaculo(boolean obstaculo) {
		this.obstaculo = obstaculo;
	}

	public HashMap<String, Nodo> getDestinos() {
		return destinos;
	}

	public void agregarDestinos(String orientacion, Nodo adyacente) {
		destinos.put(orientacion, adyacente);
	}

	public HashMap<String, Integer> getDistancias() {
		return distancias;
	}

	public void setDistancias(HashMap<String, Integer> distancias) {
		this.distancias = distancias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		return nombre.equals(((Nodo) obj).getNombre());
	}

	public void setDestinos(HashMap<String, Nodo> destinos) {
		this.destinos = destinos;
	}

	public Nodo clone() {
		Nodo clonado = new Nodo(nombre, idNodo, nivel, obstaculo); 
		clonado.setDistancias(distancias);
		clonado.setDestinos(destinos);
		return clonado;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nombre;
	}
}
