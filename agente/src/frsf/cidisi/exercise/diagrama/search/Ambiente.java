package frsf.cidisi.exercise.diagrama.search;

import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.environment.Environment;

public class Ambiente extends Environment {

<<<<<<< HEAD
    public Ambiente() {
        // Create the environment state
        this.environmentState = new EstadoAmbiente();

        environmentState.initState();
    }

    public EstadoAmbiente getEnvironmentState() {
        return (EstadoAmbiente) super.getEnvironmentState();
    }

    /**
     * This method is called by the simulator. Given the Agent, it creates
     * a new perception reading, for example, the agent position.
     * @param agent
     * @return A perception that will be given to the agent by the simulator.
     */
    @Override
    public  AgentePerception getPercept() {
        // Create a new perception to return
         AgentePerception perception = new AgentePerception();
		//TODO MODIFICADO: Set the perceptions sensors
        perception.setExisteObstaculo( ((EstadoAmbiente) environmentState).getPosicionAgente().isObstaculo());
        // Return the perception
        return perception;
    }

    
    public String toString() {
        return environmentState.toString();
    }

    
    public boolean agentFailed(Action actionReturned) {

        EstadoAmbiente envState =
                this.getEnvironmentState();

        // TODO: Complete Method        

        return false;
    }

	//TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
    
    
=======
	public Ambiente() {
		// Create the environment state
		environmentState = new EstadoAmbiente();
		environmentState.initState();
	}

	public EstadoAmbiente getEnvironmentState() {
		return (EstadoAmbiente) super.getEnvironmentState();
	}

	/**
	 * This method is called by the simulator. Given the Agent, it creates a new
	 * perception reading, for example, the agent position.
	 * 
	 * @param agent
	 * @return A perception that will be given to the agent by the simulator.
	 */
	@Override
	public AgentePerception getPercept() {
		// Create a new perception to return
		AgentePerception perception = new AgentePerception();

		// TODO : Set the perceptions sensors
		perception.setNodoPercibido(((EstadoAmbiente) environmentState).getPosicionAgente());

		// Return the perception
		return perception;
	}

	public String toString() {
		return environmentState.toString();
	}

	public boolean agentFailed(Action actionReturned) {

		EstadoAmbiente envState = this.getEnvironmentState();

		// TODO: Complete Method

		return false;
	}

	// TODO: Complete this section with agent-specific methods
	// The following methods are agent-specific:

>>>>>>> adf81b6964ea7fe121de9f9176873436d7c73353
}
