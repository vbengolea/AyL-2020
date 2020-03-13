package automatas;

import java.util.Set;

import utils.Tupla;

public class NFA extends FA {

	/*
	 *  Construction
	*/
	
	// Constructor
	public NFA(StateSet states, Alphabet alphabet, Set<Tupla<State,Character,State>> transitions)
	throws IllegalArgumentException
	{
		// TODO
		
		
		assert repOk();

	}
	
	
	
	
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
		// TODO: Check that the alphabet does not contains lambda.
		// TODO: Check that one and just one  state is marked to be a initial state.
		// TODO: Check that all transitions are correct. All states and characters should be part of the automaton set of states and alphabet.
		return true;
	} 


}
