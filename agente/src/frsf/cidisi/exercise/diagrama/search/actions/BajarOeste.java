package frsf.cidisi.exercise.diagrama.search.actions;

import frsf.cidisi.exercise.Constantes;
import frsf.cidisi.exercise.diagrama.grafo.Nodo;
import frsf.cidisi.exercise.diagrama.search.*;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

public class BajarOeste extends SearchAction {

    /**
     * This method updates a tree node state when the search process is running.
     * It does not updates the real world state.
     */
    @Override
    public SearchBasedAgentState execute(SearchBasedAgentState s) {
EstadoAgente agState = (EstadoAgente) s;
        
        // TODO MODIFICADO: Use this conditions

        //Obtenemos el nodo adyacente que se alcanza yendo al ESTE
		Nodo siguiente = agState.getPosicion().getDestinos().get(Constantes.BAJAROESTE);

		//Modificamos el estado del Agente
		if (siguiente != null) {
			agState.setPosicion(siguiente);
			return agState;
		}

        return null;
    }

    /**
     * This method updates the agent state and the real world state.
     */
    @Override
    public EnvironmentState execute(AgentState ast, EnvironmentState est) {
    	EstadoAmbiente environmentState = (EstadoAmbiente) est;
        EstadoAgente agState = ((EstadoAgente) ast);

        // TODO MODIFICADO: Use this conditions
        
        //Obtenemos el nodo adyacente que se alcanza yendo al ESTE
		Nodo siguiente = agState.getPosicion().getDestinos().get(Constantes.BAJAROESTE);

		
		if (siguiente != null) {
			//Modificamos el estado del Agente
			agState.setPosicion(siguiente);
			
			//Modificamos el estado del Ambiente
			environmentState.setPosicionAgente(siguiente);
			
			return environmentState;
		}

     /*   if (true) {
            // Update the real world
            // Update the agent state
        }*/

        return null;
    }

    /**
     * This method returns the action cost.
     */
    @Override
    public Double getCost() {
        return new Double(0);
    }

    /**
     * This method is not important for a search based agent, but is essensial
     * when creating a calculus based one.
     */
    @Override
    public String toString() {
        return "BajarOeste";
    }
}