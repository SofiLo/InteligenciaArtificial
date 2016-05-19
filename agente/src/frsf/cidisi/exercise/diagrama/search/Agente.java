package frsf.cidisi.exercise.diagrama.search;

import frsf.cidisi.exercise.diagrama.search.actions.Apagar;
import frsf.cidisi.exercise.diagrama.search.actions.IrNorte;
import frsf.cidisi.exercise.diagrama.search.actions.IrSur;
import frsf.cidisi.exercise.diagrama.search.actions.IrEste;
import frsf.cidisi.exercise.diagrama.search.actions.IrOeste;
import frsf.cidisi.exercise.diagrama.search.actions.SubirNorte;
import frsf.cidisi.exercise.diagrama.search.actions.SubirEste;
import frsf.cidisi.exercise.diagrama.search.actions.SubirSur;
import frsf.cidisi.exercise.diagrama.search.actions.SubirOeste;
import frsf.cidisi.exercise.diagrama.search.actions.BajarNorte;
import frsf.cidisi.exercise.diagrama.search.actions.BajarSur;
import frsf.cidisi.exercise.diagrama.search.actions.BajarEste;
import frsf.cidisi.exercise.diagrama.search.actions.BajarOeste;

import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.Problem;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgent;
import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.solver.search.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Vector;

public class Agente extends SearchBasedAgent {

    public Agente() {

        // The Agent Goal
        ObjetivoAgente agGoal = new ObjetivoAgente();

        // The Agent State
        EstadoAgente agState = new EstadoAgente();
        this.setAgentState(agState);

        // Create the operators
        Vector<SearchAction> operators = new Vector<SearchAction>();
        operators.addElement(new Apagar());
        operators.addElement(new IrNorte());
        operators.addElement(new IrEste());
        operators.addElement(new IrSur());
        operators.addElement(new IrOeste());
        operators.addElement(new SubirNorte());		
        operators.addElement(new SubirEste());	
        operators.addElement(new SubirSur());	
        operators.addElement(new SubirOeste());	
        operators.addElement(new BajarNorte());	
        operators.addElement(new BajarSur());	
        operators.addElement(new BajarEste());	
        operators.addElement(new BajarOeste());	

        // Create the Problem which the agent will resolve
        Problem problem = new Problem(agGoal, agState, operators);
        this.setProblem(problem);
    }

    /**
     * This method is executed by the simulator to ask the agent for an action.
     */
    @Override
    public Action selectAction() {
    	
    	//TODO VER ESTOOOOOO: Con Estrategia de costo
        // Create the search strategy
        BreathFirstSearch strategy = new BreathFirstSearch();          

        // Create a Search object with the strategy
        Search searchSolver = new Search(strategy);

        /* Generate an XML file with the search tree. It can also be generated
         * in other formats like PDF with PDF_TREE */
        searchSolver.setVisibleTree(Search.GRAPHVIZ_TREE);

        // Set the Search searchSolver.
        this.setSolver(searchSolver);

        // Ask the solver for the best action
        Action selectedAction = null;
        try {
            selectedAction =
                    this.getSolver().solve(new Object[]{this.getProblem()});
        } catch (Exception ex) {
            Logger.getLogger(Agente.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Return the selected action
        return selectedAction;

    }

    /**
     * This method is executed by the simulator to give the agent a perception.
     * Then it updates its state.
     * @param p
     */
    @Override
    public void see(Perception p) {
        this.getAgentState().updateState(p);
    }
}
