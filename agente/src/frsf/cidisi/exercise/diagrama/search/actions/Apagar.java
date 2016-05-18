package frsf.cidisi.exercise.diagrama.search.actions;

import frsf.cidisi.exercise.Constantes;
import frsf.cidisi.exercise.diagrama.grafo.Nodo;
import frsf.cidisi.exercise.diagrama.search.*;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

public class Apagar extends SearchAction {

    /**
     * This method updates a tree node state when the search process is running.
     * It does not updates the real world state.
     */
    @Override
    public SearchBasedAgentState execute(SearchBasedAgentState s) {        
        // TODO MODIFICADO: Use this conditions

		//Modificamos el estado del Agente
		if (((EstadoAgente) s).getEnergia() <= 0) {
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

 		//Modificamos el estado del Agente
 		if (((EstadoAgente) ast).getEnergia() == 0){
 			return est;
 		}

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
        return "IrEste";
    }
}