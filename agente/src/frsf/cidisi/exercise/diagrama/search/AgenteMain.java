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
        
        /*//Aca se abre la interfaz? implemento a partir de eso. VER y CAMBIAR si es necesario
        Inicio interfaz = new Inicio();

        
        //obtengo el inicio y destino que se ingresó en la interfaz
        String inicio = interfaz.getInicio();
        String destino = interfaz.getDestino();
        */
        
        //los agrego al estado del Ambiente
        
        String nodoObstaculo = "blabla";
        EstadoAmbiente estadoAmbiente = new EstadoAmbiente();
        estadoAmbiente.setearObstaculos(nodoObstaculo);
        
        simulator.start();
    }

}
