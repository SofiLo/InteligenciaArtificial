package frsf.cidisi.exercise.diagrama.search;

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
	private Grafo mapaAgente;
	private Nodo nodoDestino;

	public EstadoAgente() {
		this.initState();
	}

	/**
	 * This method clones the state of the agent. It's used in the search
	 * process, when creating the search tree.
	 */
	@Override
	public SearchBasedAgentState clone() {

		// TODO MODIFICADO: Complete Method
		EstadoAgente nuevoEstado = new EstadoAgente();
		nuevoEstado.setPosicion(posicion);
		
		Grafo grafoAgente = new Grafo();
		nuevoEstado.setMapaAgente(grafoAgente);
		
		return nuevoEstado;

	}

	/**
	 * This method is used to update the Agent State when a Perception is
	 * received by the Simulator.
	 */
	@Override
	public void updateState(Perception p) {

		// TODO HECHO,FALTA PUSH FRAN: Complete Method
	
	}

	/**
	 * This method is optional, and sets the initial state of the agent.
	 */
	@Override
	public void initState() {
		
		//TODO MODIFICADO:
		energia = 1;
		mapaAgente = new Grafo(); //se inicializa el mapa. La def está en el constructor de Grafo
		posicion = new Nodo("Mastil", 0, 0, false);
		
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

		/*if (!(obj instanceof EstadoAgente)) {
            return false;
        }
        return posicion.equals(((EstadoAgente) obj).getPosicion());*/
		
		return true;
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
