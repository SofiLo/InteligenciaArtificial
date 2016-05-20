package frsf.cidisi.exercise.diagrama.search;

import pantallas.Inicio;
<<<<<<< HEAD

import frsf.cidisi.exercise.diagrama.grafo.Nodo;
=======
>>>>>>> 9e8d01e4553986478225b8ee4d3e3e81f4979f7b
import frsf.cidisi.faia.exceptions.PrologConnectorException;

public class AgenteMain {	
	
	public static void main(String[] args) throws PrologConnectorException {
		//Simulador
		Agente agent = new Agente();
		Ambiente environment = new Ambiente();
		SearchExtendido simulator = new SearchExtendido(environment, agent);
			
		//Interfaz
		final Inicio frame = new Inicio((EstadoAgente) agent.getAgentState(), simulator, environment);
		
<<<<<<< HEAD
		System.out.print("\ninicio"+inicio);
		System.out.print("\ndestino" +destino);
		System.out.print("\nlista obstaculos: "+frame.listaObstaculos());

		// TODO aca seteamos los obstaculos
		environment.getEnvironmentState().setearObstaculos("Biblioteca");
		
		// Aca defino el nodo destino

		((EstadoAgente) agent.getAgentState()).setNodoDestino(new Nodo("Estadio", 2, 0, false));
		
		
		simulator.start();
=======
		simulator.setFrame(frame);
>>>>>>> 9e8d01e4553986478225b8ee4d3e3e81f4979f7b
	}
}
