package automatas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;

import utils.Tupla;

/* Implements a DFA (Deterministic Finite Automaton).
*/
public class DFA extends FA {

	/*	
	 * 	Construction
	*/

	
	// Constructor
	
	
	public DFA(StateSet states, Alphabet alphabet, 
			Set<Tupla<State,Character,State>> transitions) throws IllegalArgumentException
	{	
		
		
		
		// TODO
		assert repOk();
	}
	
	/*
	 *	State querying 
	*/
		
	
	
	/*
	 *  Automata methods
	*/
	
	
	@Override
	public boolean accepts(String string) {
		assert repOk();
		assert string != null;
		assert verifyString(string);
		// TODO
		return false;
	}
	
	@Override
	public boolean repOk() {
		// TODO: Check that one and just one  state is marked to be a initial state.
		// TODO: Check that all transitions are correct. All states and characters should be part of the automaton set of states and alphabet.
		// TODO: Check that there are not lambda transitions
		// TODO: Check that the transition relation is deterministic.
		return true;
	}
	
	
	
	/**
	 * Returns a new automaton which recognizes the complementary
	 * language. 
	 * 
	 * @returns a new DFA accepting the language's complement.
	 */
	public DFA complement() {
		assert repOk();
		// TODO
		return null;		
	}

	
	/**
	 * Returns a new automaton which recognizes the intersection of both
	 * languages, the one accepted by 'this' and the one represented
	 * by 'other'. 
	 * 
	 * @returns a new DFA accepting the intersection of both languages.
	 */	
	public DFA intersection(DFA other) {
		assert repOk();
		assert other.repOk();
		// TODO
		return null;		
	}
	
	/**
	 * Returns the representation of the given DFA as a string in the DOT language
	 * later used to draw the DFA
	 * @returns a string representing the DFA in DOT language
	 * */	
	public String toDot() {
		assert repOk();
		
		//Initial State is added
		String dot = "digraph {\n";
		dot += "inic[shape=point];\n";
		dot += "inic->" + this.initialState().getName() + ";\n";
		
		//Transitions are added
		for (Entry<State, HashMap<Character, StateSet>> entry : delta.entrySet()) {
			State from = entry.getKey();
			HashMap<Character, StateSet> transitions = entry.getValue();
			
			for(Entry<Character, StateSet> eTrans : transitions.entrySet()) {
				Character with = eTrans.getKey();
				StateSet toStates = eTrans.getValue();
				
				for(State s : toStates){
		        	dot += from.getName() + "->" + s.getName() + " [label=\"" + with + "\"];\n";
		        }
			}
		}
		
		// Final States are added
		for(State s : this.finalStates()){
			dot += s.getName() + "[shape=doublecircle];\n";
		}
		return dot + "}";
	}
	
}
