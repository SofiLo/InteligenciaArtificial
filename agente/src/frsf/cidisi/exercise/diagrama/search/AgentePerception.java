package frsf.cidisi.exercise.diagrama.search;

import frsf.cidisi.faia.agent.Agent;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;

public class AgentePerception extends Perception {

	//TODO: Setup Statics
    //public static int UNKNOWN_PERCEPTION = -1;   
	
	
	//TODO: Setup Sensors
	private boolean existeobstaculo;
	
 

    public  AgentePerception() {
    	//TODO: Complete Method
    }

    public AgentePerception(Agent agent, Environment environment) {
        super(agent, environment);
    }

    /**
     * This method is used to setup the perception.
     */
    @Override
    public void initPerception(Agent agentIn, Environment environmentIn) {
    	
    	//TODO: Complete Method
        
        //Agente agent = (Agente) agentIn;
        //Ambiente environment = (Ambiente) environmentIn;
        //EstadoAmbiente environmentState =
        //        environment.getEnvironmentState();
       
        
    }
    
    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();

        //TODO: Complete Method

        return (existeobstaculo?"Hay obstaculo" : "No hay obstaculo");
    }

    // The following methods are agent-specific:
    //TODO: Complete this section with the agent-specific methods
	
     public boolean getExisteObstaculo(){
        return existeobstaculo;
     }
     public void setExisteObstaculo(boolean arg){
        this.existeobstaculo = arg;
     }
	
   
}
