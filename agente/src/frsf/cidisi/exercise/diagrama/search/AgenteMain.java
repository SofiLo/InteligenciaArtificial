package frsf.cidisi.exercise.diagrama.search;

import Pantallas.Inicio;
import frsf.cidisi.faia.exceptions.PrologConnectorException;
import frsf.cidisi.faia.simulator.SearchBasedAgentSimulator;

public class AgenteMain {

    public static void main(String[] args) throws PrologConnectorException {
        Agente agent = new Agente();

        Ambiente environment = new Ambiente();

        SearchBasedAgentSimulator simulator =
                new SearchBasedAgentSimulator(environment, agent);
        
        //Aca se abre la interfaz? implemento a partir de eso. VER y CAMBIAR si es necesario
        Inicio interfaz = new Inicio();
        EstadoAmbiente estadoAmbiente = new EstadoAmbiente();
        
        //obtengo el inicio y destino que se seteo en la interfaz
        String inicio = interfaz.getInicio();
        String destino = interfaz.getDestino();
        String nodoObstaculo = "blabla"; // = interfaz.getObstaculos();
        
        //los agrego al estado del Ambiente
        estadoAmbiente.setearObstaculos(nodoObstaculo);
        
        simulator.start();
    }

}
