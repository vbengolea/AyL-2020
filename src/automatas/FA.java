package automatas;

import java.util.HashMap;
import java.util.Set;

public abstract class FA {
	
	protected StateSet states;
	
	protected Alphabet alphabet;
	
	
	/**All states used in delta function 
	* must belong to the automaton states  set 
	* and all labels must belong to the automaton alphabet
	**/ 
	protected HashMap<State, HashMap<Character, StateSet>> delta;
	
	
	/*
	 * @return the atomaton's set of states.
	 */
	public StateSet getStates(){
		// TODO
		return null;
	}
	
	
	/**
	 * @return the atomaton's alphabet.
	 */
	public Alphabet getAlphabet(){
		// TODO
		
		return null;
		
	}
	
	/**
	 * @return the atomaton's initial state.
	 */
	public State initialState(){
		// TODO
		return null;
	}
	
	/**
	 * @return the atomaton's final states.
	 */
	public StateSet finalStates(){
		// TODO
		return null;
	}
	
	/**
	 * Query for the automaton's transition function.
	 * 
	 * @return A set of states (when FA is a DFA this method return a 
	 * singleton set) corresponding to the successors of the given state 
	 * via the given label according to the transition function.
	 */
	public  StateSet delta(State from, Character label){
		assert states.belongTo(from.getName())!=null;
		assert alphabet.belongTo(label);
	
		//TODO
		return null;
	
	}
		
	/**
	 * Verifies whether the string is composed of characters in the alphabet of the automaton. 
	 * @return True iff the string consists only of characters in the alphabet.
	 */
	public boolean verifyString(String s) {
		// TODO
		return false;
	}
	
	
	/**
	 * TODO: Abstract methods to be implements for the subclasses
	 * **/
	
	/**
	 * @return True iff the automaton is in a consistent state.
	 */
	public abstract boolean repOk(); 
	
	
	
	/**
	 * Tests whether a string belongs to the language of the current 
	 * finite automaton.
	 * 
	 * @param string String to be tested for acceptance.
	 * @return Returns true iff the current automaton accepts the given string.
	 */
	public abstract boolean accepts(String string);

}
