package frsf.cidisi.exercise.diagrama.search;

import java.util.ArrayList;
import java.util.Iterator;

import frsf.cidisi.exercise.diagrama.grafo.Grafo;
import frsf.cidisi.exercise.diagrama.grafo.Nodo;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;

/**
 * Represent the internal state of the Agent.
 */
public class EstadoAgente extends SearchBasedAgentState {

	private int energia;
	private Nodo posicion;
<<<<<<< HEAD
	private Grafo mapaAgente;
=======
	private Grafo mapaAgente; // Lista de obstaculos
>>>>>>> adf81b6964ea7fe121de9f9176873436d7c73353
	private Nodo nodoDestino;
	private ArrayList<Nodo> listaObstaculos;
	
	public EstadoAgente() {
		this.initState();
	}

	public void setListaObstaculos(ArrayList<Nodo> listaObstaculos) {
		this.listaObstaculos = listaObstaculos;
	}

	public ArrayList<Nodo> getListaObstaculos() {
		return listaObstaculos;
	}

	/**
	 * This method clones the state of the agent. It's used in the search
	 * process, when creating the search tree.
	 */
	@Override
	public SearchBasedAgentState clone() {

<<<<<<< HEAD
		// TODO MODIFICADO: Complete Method
		EstadoAgente nuevoEstado = new EstadoAgente();
		nuevoEstado.setPosicion(posicion);
		
		Grafo grafoAgente = new Grafo();
		nuevoEstado.setMapaAgente(grafoAgente);
		
		return nuevoEstado;

=======
		EstadoAgente nuevoEstado = new EstadoAgente();
		ArrayList<Nodo> nuevaLista = new ArrayList<Nodo>();
		
		nuevoEstado.setNodoDestino(nodoDestino.clone());
		nuevoEstado.setPosicion(posicion.clone());
		
		
		Iterator<Nodo> iter = listaObstaculos.iterator();
		while(iter.hasNext()) {
			nuevaLista.add(iter.next().clone());
		}
		
		nuevoEstado.setListaObstaculos(nuevaLista);
		
		// TODO: Complete Method

		return nuevoEstado;
>>>>>>> adf81b6964ea7fe121de9f9176873436d7c73353
	}

	/**
	 * This method is used to update the Agent State when a Perception is
	 * received by the Simulator.
	 */
	@Override
	public void updateState(Perception p) {
<<<<<<< HEAD

		// TODO HECHO,FALTA PUSH FRAN: Complete Method
	
=======
		posicion = ((AgentePerception) p).getNodoPercibido();
		
		if(posicion.isObstaculo()) {
			listaObstaculos.add(posicion);
		}
>>>>>>> adf81b6964ea7fe121de9f9176873436d7c73353
	}

	/**
	 * This method is optional, and sets the initial state of the agent.
	 */
	@Override
	public void initState() {
<<<<<<< HEAD
		
		//TODO MODIFICADO:
		energia = 1;
		mapaAgente = new Grafo(); //se inicializa el mapa. La def está en el constructor de Grafo
		posicion = new Nodo("Mastil", 0, 0, false);
		
=======

		listaObstaculos = new ArrayList<Nodo>();
>>>>>>> adf81b6964ea7fe121de9f9176873436d7c73353
	}

	/**
	 * This method returns the String representation of the agent state.
	 */
	@Override
	public String toString() {
		
		// TODO MODIFICADO: Complete Method
		String str = "Posicion: " + posicion;
		return str;
	}

	/**
	 * This method is used in the search process to verify if the node already
	 * exists in the actual search.
	 */
	@Override
	public boolean equals(Object obj) {

		// TODO MODIF. VER CON PUSH FRAN: Complete Method

<<<<<<< HEAD
		/*if (!(obj instanceof EstadoAgente)) {
            return false;
        }
        return posicion.equals(((EstadoAgente) obj).getPosicion());*/
		
		return true;
=======
		return (posicion.equals(((EstadoAgente) obj).getPosicion())?true:false);
	}

	public Nodo getNodoDestino() {
		return nodoDestino;
	}

	public void setNodoDestino(Nodo nodoDestino) {
		this.nodoDestino = nodoDestino;
	}

	public Nodo getPosicion() {
		return posicion;
	}

	public void setPosicion(Nodo posicion) {
		this.posicion = posicion;
>>>>>>> adf81b6964ea7fe121de9f9176873436d7c73353
	}

	// TODO: Complete this section with agent-specific methods
	// The following methods are agent-specific:

	// public Other getposicion(){
	// return posicion;
	// }
	// public void setposicion(Other arg){
	// posicion = arg;
	// }
	// public int getenergia(){
	// return energia;
	// }
	// public void setenergia(int arg){
	// energia = arg;
	// }
	// public Other getlistaObstaculo(){
	// return listaObstaculo;
	// }
	// public void setlistaObstaculo(Other arg){
	// listaObstaculo = arg;
	// }
	// public Other getnodoDestino(){
	// return nodoDestino;
	// }
	// public void setnodoDestino(Other arg){
	// nodoDestino = arg;
	// }

	public Grafo getMapaAgente() {
		return mapaAgente;
	}

	public void setMapaAgente(Grafo mapaAgente) {
		this.mapaAgente = mapaAgente;
	}

	public Nodo getPosicion() {
		return posicion;
	}

	public void setPosicion(Nodo posicion) {
		this.posicion = posicion;
	}
}
