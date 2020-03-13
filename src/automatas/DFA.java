package automatas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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
	
}
