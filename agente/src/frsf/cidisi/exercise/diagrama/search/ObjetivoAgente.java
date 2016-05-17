

package frsf.cidisi.exercise.diagrama.search;

import frsf.cidisi.faia.agent.search.GoalTest;
import frsf.cidisi.faia.state.AgentState;

public class ObjetivoAgente extends GoalTest {

    @Override
    public boolean isGoalState (AgentState agentState) {
    
    	// TODO: Complete Method
        if  ( ((EstadoAgente) agentState).getNodoDestino().equals(((EstadoAgente) agentState).getPosicion()) ) //( NodoActual = NodoDestino)
        	{
            return true;
        	}
        return false;
	}
}