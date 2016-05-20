package frsf.cidisi.exercise.diagrama.search;

import java.util.HashMap;

import frsf.cidisi.faia.solver.search.IStepCostFunction;
import frsf.cidisi.faia.solver.search.NTree;

/**
 * This class can be used in any search strategy like Uniform Cost.
 */
public class CostFunction implements IStepCostFunction {

	/**
	 * This method calculates the cost of the given NTree node.
	 */
	public int calculateCost(NTree node) {

		// TODO VER ESTOOOOOO:
		String accion;
		if(node.getAction()!= null){
			accion = node.getAction().toString();
		}
		else
			return 0;
		
		HashMap<String, Integer> distancias = ((EstadoAgente) node.getParent().getAgentState()).getPosicion().getDistancias();

		if((distancias.get(accion)==null)){
			return 0;
		}else{
			return (int)distancias.get(accion);
		}

	}
}
