package frsf.cidisi.exercise.diagrama.grafo;

import java.util.HashMap;

public class Nodo {
	private String nombre;
	private int idNodo;
	private int nivel;
	private boolean obstaculo;
	HashMap<String, Nodo> destinos = new HashMap<String, Nodo>();
	HashMap<String, Integer> distancias = new HashMap<String, Integer>();
	
	public Nodo(){
		/*this.nombre = nombre;
		this.idNodo = idNodo;
		this.nivel = nivel;
		this.obstaculo = obstaculo;*/
	}
	public Nodo(String nombre, int idNodo, int nivel, boolean obstaculo) {
		super();
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
	public boolean equals(Nodo obj) {
		return obj.getNombre() == nombre;
	}
}
