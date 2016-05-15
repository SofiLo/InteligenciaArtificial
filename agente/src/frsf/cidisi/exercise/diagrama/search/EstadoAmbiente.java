package frsf.cidisi.exercise.diagrama.search;

import frsf.cidisi.exercise.diagrama.grafo.Grafo;
import frsf.cidisi.exercise.diagrama.grafo.Nodo;
import frsf.cidisi.faia.state.EnvironmentState;

/**
 * This class represents the real world state.
 */
public class EstadoAmbiente extends EnvironmentState {
		
	private Nodo posicionAgente;
	private Grafo mapa;
	
    public EstadoAmbiente() {

    	posicionAgente = new Nodo();
    	mapa = new Grafo();	
    	
        this.initState();
    }

    /**
     * This method is used to setup the initial real world.
     */
    public void initState(){
    	
    	//la posicion inicial del agente sera el mastil
    	posicionAgente.setIdNodo(0);
    	posicionAgente.setNombre("Mastil");
    	posicionAgente.setNivel(0);
    	posicionAgente.setObstaculo(true);
    }
    
    public void setearObstaculos(String nodoObstaculo) {  	
    	mapa.getNodoPorNombre(nodoObstaculo).setObstaculo(true);
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

	public Nodo getPosicionAgente() {
		return posicionAgente;
	}

	public void setPosicionAgente(Nodo posicionAgente) {
		this.posicionAgente = posicionAgente;
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

