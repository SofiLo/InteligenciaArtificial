<<<<<<< HEAD


package frsf.cidisi.exercise.diagrama.search;

import frsf.cidisi.faia.agent.search.GoalTest;
import frsf.cidisi.faia.state.AgentState;

public class ObjetivoAgente extends GoalTest {

    @Override
    public boolean isGoalState (AgentState agentState) {
    
    	// TODO HECHO,FALTA PUSH FRAN: Complete Method
        if  (true) //( NodoActual = NodoDestino)
        	{
            return true;
        	}
        return false;
	}
=======


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
>>>>>>> adf81b6964ea7fe121de9f9176873436d7c73353
}