package frsf.cidisi.exercise.diagrama.search;

import frsf.cidisi.exercise.Inicializacion;
import frsf.cidisi.exercise.diagrama.grafo.Grafo;
import frsf.cidisi.exercise.diagrama.grafo.Nodo;
import frsf.cidisi.faia.state.EnvironmentState;

/**
 * This class represents the real world state.
 */
public class EstadoAmbiente extends EnvironmentState {
	
	//TODO: Setup Variables
    //private Other posicionAgente;
    //private Other mapa;
	
	private Nodo posicionAgente;
	private Grafo mapa;
	
    public EstadoAmbiente() {
    	
    	// posicionAgente = initData0;
		// mapa = initData1;
    	
    	posicionAgente = new Nodo();
    	mapa = new Grafo();
    	Inicializacion iniciar = new Inicializacion();
    	
    	iniciar.inicializacion(mapa);
    	
        //this.initState();
    }

    /**
     * This method is used to setup the initial real world.
     */
    public void initState(){
    	
    }
    
    public void setearObstaculos(String nodoObstaculo) {
    	
    	mapa.getNodo(nodoObstaculo).setObstaculo(true);
    }

    /**
     * String representation of the real world state.
     */
    @Override
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
//     public Other getmapa(){
//        return mapa;
//     }
//     public void setmapa(Other arg){
//        mapa = arg;
//     }
	

}

