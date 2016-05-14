package frsf.cidisi.exercise.diagrama.search;

import java.util.ArrayList;
import java.util.List;

import frsf.cidisi.exercise.diagrama.grafo.Nodo;
import frsf.cidisi.faia.state.EnvironmentState;

/**
 * This class represents the real world state.
 */
public class EstadoAmbiente extends EnvironmentState {
	
	 private Nodo posicionAgente;
	 private List<Nodo> nodos;
	
    public EstadoAmbiente() {
        
    	//TODO: Complete Method
    	// posicionAgente = initData0;
		// nodos = initData1;
   	
    	posicionAgente = new Nodo();
    	nodos = new ArrayList<Nodo>();
    	
        this.initState();
    }

    /**
     * This method is used to setup the initial real world.
     */
    
    public void initState() {

        //TODO: Complete Method
    	//este seria el estado inicial del AMBIENTE. El escenario de entrada
    	//y deberiamos indicarle cual seria el nodo incial
    	
    	Nodo nodoInicial = new Nodo();
    	posicionAgente = nodoInicial;
    	
    	
    	
    }

    /**
     * String representation of the real world state.
     */
    
    public String toString() {
        String str = "";

        //TODO: Complete Method

        return str;
    }

	//TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
	
//     public Other getposicionAgente(){
//        return posicionAgente;
//     }
//     public void setposicionAgente(Other arg){
//        posicionAgente = arg;
//     }
//     public Other getnodos(){
//        return nodos;
//     }
//     public void setnodos(Other arg){
//        nodos = arg;
//     }
	

}

