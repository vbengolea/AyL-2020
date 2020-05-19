package searchPatterns;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import automatas.Alphabet;
import automatas.AutomatonException;
import automatas.DFA;

public class PatternList {
	
	/*
	This list stores deterministic finite automata,
	each of them represents a pattern of characters whose occurrence
	we want to check in a given text file (in hexadecimal format)
	 * */
	private List<DFA> patterns;
	
	private DFA patternsDFA;
	
	private static Set<Character>  sigma = new HashSet<Character>(Arrays.asList('0','1','2','3','4','5','6','7','8','9', 'a', 'b', 'c', 'd', 'e' , 'f'));

	
	public PatternList(List<DFA> list) throws AutomatonException {
		this.patterns = list;
		try {
			patternsDFA =buildAutomaton();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Builds and returns the automaton that recognizes 
	 * any of the patterns in the pattern list
	 * @return the automaton that recognizes 
	 * any of the patterns in the pattern list
	 * */
	private DFA buildAutomaton() throws AutomatonException {
		//TODO : HINT you should use the method forAllUnion here
		return null;
	}
	
	/*
	 * This method returns the automaton union 
	 * of the automata contained in the Patterns list
	 * */
	private DFA forAllUnion() throws AutomatonException {
		//TODO
		return null;
	}
	
	
	/* @return true if any of the patterns in 
	 * the pattern list occurs in the given string, 
	 * false in otherwise
	 * @param line: string to be  scanned.
	 * */
	public boolean scan(String line) throws AutomatonException {
		if (patternsDFA ==null)
			throw new AutomatonException();
		return patternsDFA.accepts(line);
	}

	
}
