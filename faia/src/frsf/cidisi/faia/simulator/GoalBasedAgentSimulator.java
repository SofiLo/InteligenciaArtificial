/*
 * Copyright 2007-2009 Georgina Stegmayer, Milagros Gutiérrez, Jorge Roa
 * y Milton Pividori.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package frsf.cidisi.faia.simulator;

import java.util.Vector;

import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.agent.Agent;
import frsf.cidisi.faia.agent.GoalBasedAgent;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;
import frsf.cidisi.faia.simulator.events.EventType;
import frsf.cidisi.faia.simulator.events.SimulatorEventNotifier;

public abstract class GoalBasedAgentSimulator extends Simulator {

    /**
     * 
     * @param environment
     */
    public GoalBasedAgentSimulator(Environment environment, Vector<Agent> agents) {
        super(environment, agents);
    }

    public GoalBasedAgentSimulator(Environment environment, Agent agent) {
        Vector<Agent> ags = new Vector<Agent>();
        ags.add(agent);

        this.environment = environment;
        this.agents = ags;
    }

    @Override
    public void start() {

    
    }

    /**
     * Here we update the state of the agent and the real state of the
     * simulator.
     * @param action
     */
    protected void updateState(Action action) {
        this.getEnvironment().updateState(((GoalBasedAgent) agents.elementAt(0)).getAgentState(), action);
    }

    public abstract boolean agentSucceeded(Action action);

    public abstract boolean agentFailed(Action action);

    /**
     * This method is executed in the mail loop of the simulation when the
     * agent returns an action.
     * @param agent
     * @param action
     */
    public abstract void actionReturned(Agent agent, Action action);

    /**
     * @return The name of the simulator, e.g. 'SearchBasedAgentSimulator'
     */
    public abstract String getSimulatorName();
}
