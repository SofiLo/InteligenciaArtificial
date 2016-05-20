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
	public double calculateCost(NTree node) {

		// TODO VER ESTOOOOOO:
		String accion;
		if(node.getAction()!= null){
			accion = node.getAction().toString();
		}
		else
			return 0;
		
		HashMap<String, Integer> distancias = ((EstadoAgente) node.getAgentState()).getPosicion().getDistancias();
		
		if((distancias.get(accion)==null)){
//			System.out.print("\nEl vector distancias no tiene ese operador\n");
			return 0;
		}else{
			return distancias.get(accion);
		}
				
		/*System.out.print("distancia del nodo "+((EstadoAgente) node.getAgentState()).getPosicion()
				.getNombre()+" con el operador: "+accion+" esss:  "+));
		return distancias.get(accion);*/
	}
}
