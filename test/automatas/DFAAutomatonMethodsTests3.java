package automatas;
import static org.junit.Assert.*;

import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

import utils.DotReader;
import utils.Tupla;

public class DFAAutomatonMethodsTests3 { 
	

	
	 private static StateSet s;
	 private static Alphabet a;
	 private static Set<Tupla<State,Character,State>> t; 

	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		DotReader dotReader = new DotReader("test/dfa3");
		dotReader.parse();
		
		s = dotReader.getNodes();
		a = dotReader.getSymbols();
		t = dotReader.getArcs(); 		
	}

	// Tests for DFA3
	
	
	@Test
	public void testAccept(){
		DFA dfa = new DFA(s,a,t);
		assertTrue(dfa.accepts("aaa"));
	}

	@Test
	public void testNoAccept(){
		DFA dfa = new DFA(s,a,t);
		assertFalse(dfa.accepts("aa"));
	}
	
	@Test
	public void testComplement1(){
		DFA dfa = new DFA(s,a,t);
		assertFalse(dfa.complement().accepts("aaa"));
	}
	
	@Test
	public void testComplement2(){
		DFA dfa = new DFA(s,a,t);
		assertTrue(dfa.complement().accepts("aa"));
	}	
	
	// Other Tests
	
	@Test
	public void testFinalState1(){
		DFA dfa = new DFA(s,a,t);
		StateSet f = dfa.finalStates();
		assertTrue(f.size()==1);
	}
	
	@Test
	public void testFinalState2(){
		DFA dfa = new DFA(s,a,t);
		StateSet f = dfa.finalStates();
		assertTrue(f.belongTo("q1")!=null);
	}
	
	@Test
	public void testFinalState3(){
		DFA dfa = new DFA(s,a,t);
		StateSet f = dfa.finalStates();
		assertTrue(f.belongTo("q0")==null);
	}
	
	@Test
	public void testInitialState(){
		DFA dfa = new DFA(s,a,t);
		State i = dfa.initialState();
		assertTrue(i.getName().equals("q0"));
	}
	
}
