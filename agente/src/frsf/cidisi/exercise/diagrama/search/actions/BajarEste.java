package frsf.cidisi.exercise.diagrama.search.actions;

import frsf.cidisi.exercise.Constantes;
import frsf.cidisi.exercise.diagrama.grafo.Nodo;
import frsf.cidisi.exercise.diagrama.search.*;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

public class BajarEste extends SearchAction {

    /**
     * This method updates a tree node state when the search process is running.
     * It does not updates the real world state.
     */
    @Override
    public SearchBasedAgentState execute(SearchBasedAgentState s) {
        
        // TODO MODIFICADO: Use this conditions

        //Obtenemos el nodo adyacente que se alcanza yendo al ESTE
		Nodo siguiente = ((EstadoAgente) s).getPosicion().getDestinos().get(Constantes.BAJARESTE);

		//Modificamos el estado del Agente
		if (siguiente != null && !siguiente.isObstaculo()) {
			((EstadoAgente) s).setPosicion(siguiente);
			return s;
		}

        return null;
    }

    /**
     * This method updates the agent state and the real world state.
     */
    @Override
    public EnvironmentState execute(AgentState ast, EnvironmentState est) {
        // TODO MODIFICADO: Use this conditions
        
        //Obtenemos el nodo adyacente que se alcanza yendo al ESTE
		Nodo siguiente = ((EstadoAgente) ast).getPosicion().getDestinos().get(Constantes.BAJARESTE);

		
		if (siguiente != null && !siguiente.isObstaculo()) {
			//Modificamos el estado del Agente
			((EstadoAgente) ast).setPosicion(siguiente);
			((EstadoAgente) ast).setEnergia((((EstadoAgente) ast).getEnergia()-10));
			//Modificamos el estado del Ambiente
			((EstadoAmbiente) est).setPosicionAgente(siguiente);
			
			return est;
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
    	//TODO VER ESTOOOOOO:
        return new Double(1);
    }

    /**
     * This method is not important for a search based agent, but is essensial
     * when creating a calculus based one.
     */
    @Override
    public String toString() {
        return "BajarEste";
    }
}