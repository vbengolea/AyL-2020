package automatas;

import java.util.HashSet;
import java.util.Set;

/**
 * This class implements the
 * 
 * 
 * **/


public class Alphabet {

	private Set<Character> symbols;
	
	
	public Alphabet() {
		symbols = new HashSet<Character>();
	}
	
	/**
	 * Adds the specified symbol to this alphabet if it is not already present.
	 * @param c a symbol to be added to the alphabet
	 * @return true if c was added to the alphabet, false in other case
	 * **/
	public boolean addSymbol(Character c) {
		return symbols.add(c);
	}
	
	/**
	 * Removes the specified symbol from this alphabet if it is  already present.
	 * @param c a symbol to be removed from the alphabet
	 * @return true if c was removed from the alphabet, false in other case
	 * **/
	public boolean removeSymbol(Character c) {
		return symbols.remove(c);
	}
	
	
	/**
	 * Returns true if this alphabet contains the specified symbol.
	 * @param c a symbol that we want to check if it belongs to the set or not 
	 * @return true if c belong to this alphabet
	 * **/
	public boolean belongTo(Character c) {
		return symbols.contains(c);
	}

	@Override
	public String toString() {
		return symbols.toString();
	}
	
	
	
}
	