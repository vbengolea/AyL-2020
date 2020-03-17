package automatas;
import static org.junit.Assert.*;

import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

import utils.DotReader;
import utils.Tupla;

public class DFAAutomatonMethodsTests1 { 
	
	 private static StateSet s;
	 private static Alphabet a;
	 private static Set<Tupla<State,Character,State>> t; 

	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		DotReader dotReader = new DotReader("test/dfa2");
		dotReader.parse();
		
		s = dotReader.getNodes();
		a = dotReader.getSymbols();
		t = dotReader.getArcs(); 		
	}

	// Tests for DFA2
	
	@Test
	public void testRepOk(){
		DFA dfa = new DFA(s,a,t);
		assertTrue(dfa.repOk());
	}

	// Tests for DFA2
	
	@Test
	public void testAccept() {
		DFA dfa = new DFA(s,a,t);
		assertTrue(dfa.accepts("bbbbbb"));
	}

	@Test
	public void testNoAccept(){
		DFA dfa = new DFA(s,a,t);

		assertFalse(dfa.accepts("bbbbb"));
	}
		
	@Test
	public void testComplement1(){
		DFA dfa = new DFA(s,a,t);

		assertFalse(dfa.complement().accepts("bb"));
	}
	
	@Test
	public void testComplement2(){
		DFA dfa = new DFA(s,a,t);		
		assertTrue(dfa.complement().accepts("b"));
	}
	
}
