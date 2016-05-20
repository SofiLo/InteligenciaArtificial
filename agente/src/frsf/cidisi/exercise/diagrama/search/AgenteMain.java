package frsf.cidisi.exercise.diagrama.search;

import java.awt.EventQueue;

import pantallas.Inicio;

import frsf.cidisi.exercise.diagrama.grafo.Nodo;
import frsf.cidisi.faia.exceptions.PrologConnectorException;
import frsf.cidisi.faia.simulator.SearchBasedAgentSimulator;

public class AgenteMain {

	static Inicio frame = new Inicio();
	
	public static void main(String[] args) throws PrologConnectorException {
		Agente agent = new Agente();
		Ambiente environment = new Ambiente();
		String inicio; 
		String destino;
		
		
		//INICIALIZO INTERFAZ
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setSize(800, 520);
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//FIN INICIO INTERFAZ
		
		SearchBasedAgentSimulator simulator = new SearchBasedAgentSimulator(environment, agent);

		inicio = frame.getInicio(); 
		destino = frame.getDestino();
		
		System.out.print("\ninicio"+inicio);
		System.out.print("\ndestino" +destino);
		System.out.print("\nlista obstaculos: "+frame.listaObstaculos());

		// TODO aca seteamos los obstaculos
		environment.getEnvironmentState().setearObstaculos("Biblioteca");
		
		// Aca defino el nodo destino

		((EstadoAgente) agent.getAgentState()).setNodoDestino(new Nodo("Estadio", 2, 0, false));
		
		
		simulator.start();
	}
	
	public String getInicioAgente(){
		return frame.getInicio();
	}

}
