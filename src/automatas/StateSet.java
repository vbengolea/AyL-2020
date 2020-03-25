package automatas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StateSet implements Iterable<State>{
	
	private Set<State> states;
	
	public StateSet() {
		states = new HashSet<State>();
	}
	
	public State addState(String name)throws AutomatonException{
		if(name == null || name =="")
			throw new AutomatonException("Node name invalid");

		for(State f : states) {
			if(f.getName().equals(name)) {
				return f;
			}
		}
		State freshState = new State(name, false, false);
		states.add(freshState);
		return freshState;
	}
	
	public State addState(String name, boolean isInitial, boolean isFinal) throws AutomatonException{
		if(name == null || name =="")
			throw new AutomatonException("Node name invalid");

		for(State f : states) {
			if(f.getName().equals(name)) {
				f.setInitial(isInitial);
				f.setFinal(isFinal);
				return f;
			}
		}
		State freshState = new State(name, isInitial, isFinal);
		states.add(freshState);
		return freshState;
	}

	public void deleteState(String name) {
		for(State f : states) {
			if(f.getName().equals(name)) {
				states.remove(f);
				return;
			}
		}
	}
	
	public State belongTo(String name) {
		for(State f : states) {
			if(f.getName().equals(name)) {
				return f;
			}
		}
		return null;
	}
	
	public int size() {
		return states.size();
	}
	
	
	@Override
	  public Iterator<State> iterator() {
	        return states.iterator();
	  }

}
