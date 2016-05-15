package frsf.cidisi.exercise.diagrama.search;

import frsf.cidisi.exercise.diagrama.grafo.Grafo;
import frsf.cidisi.exercise.diagrama.grafo.Nodo;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;

/**
 * Represent the internal state of the Agent.
 */
public class EstadoAgente extends SearchBasedAgentState {

	private Nodo posicion;
	private int energia;
	private Grafo mapaAgente;
	private Nodo nodoDestino;

	public EstadoAgente() {

		// TODO: Complete Method
		/*
		 * // posicion = initData0; // energia = initData1; // listaObstaculo =
		 * initData2; // nodoDestino = initData3;
		 */
		this.initState();
	}

	/**
	 * This method clones the state of the agent. It's used in the search
	 * process, when creating the search tree.
	 */
	@Override
	public SearchBasedAgentState clone() {

		// TODO: Complete Method

		return null;
	}

	/**
	 * This method is used to update the Agent State when a Perception is
	 * received by the Simulator.
	 */
	@Override
	public void updateState(Perception p) {

		// TODO: Complete Method
	}

	/**
	 * This method is optional, and sets the initial state of the agent.
	 */
	@Override
	public void initState() {
		energia = 1;
		mapaAgente = new Grafo();
		posicion = new Nodo("Mastil", 0, 0, false);
	}

	/**
	 * This method returns the String representation of the agent state.
	 */
	@Override
	public String toString() {
		String str = "";

		// TODO: Complete Method

		return str;
	}

	/**
	 * This method is used in the search process to verify if the node already
	 * exists in the actual search.
	 */
	@Override
	public boolean equals(Object obj) {

		// TODO: Complete Method

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
	public int getenergia() {
		return energia;
	}

	public void setenergia(int arg) {
		energia = arg;
	}
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

}
