package frsf.cidisi.exercise.diagrama.search;

import pantallas.Inicio;
import frsf.cidisi.faia.exceptions.PrologConnectorException;

public class AgenteMain {	
	
	public static void main(String[] args) throws PrologConnectorException {
		//Simulador
		Agente agent = new Agente();
		Ambiente environment = new Ambiente();
		SearchExtendido simulator = new SearchExtendido(environment, agent);
			
		//Interfaz
		final Inicio frame = new Inicio((EstadoAgente) agent.getAgentState(), simulator, environment);
		
		simulator.setFrame(frame);
	}
}