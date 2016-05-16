package frsf.cidisi.exercise.diagrama.search;

import frsf.cidisi.exercise.diagrama.grafo.Nodo;
import frsf.cidisi.faia.exceptions.PrologConnectorException;
import frsf.cidisi.faia.simulator.SearchBasedAgentSimulator;

public class AgenteMain {

	public static void main(String[] args) throws PrologConnectorException {
		Agente agent = new Agente();

		Ambiente environment = new Ambiente();

		SearchBasedAgentSimulator simulator = new SearchBasedAgentSimulator(environment, agent);

		/*
		 * //Aca se abre la interfaz? implemento a partir de eso. VER y CAMBIAR
		 * si es necesario Inicio interfaz = new Inicio();
		 * 
		 * 
		 * //obtengo el inicio y destino que se ingres� en la interfaz String
		 * inicio = interfaz.getInicio(); String destino =
		 * interfaz.getDestino();
		 */

		// TODO aca seteamos los obstaculos
		environment.getEnvironmentState().setearObstaculos("Mastil");
		
		// Aca defino la meta
		((EstadoAgente) agent.getAgentState()).setNodoDestino(new Nodo("Mastil", 1, 0, false));

		simulator.start();
	}

}
