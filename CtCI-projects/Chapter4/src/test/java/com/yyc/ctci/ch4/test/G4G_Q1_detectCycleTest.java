package com.yyc.ctci.ch4.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yyc.ctci.ch4.G4G_Q1_detectCycle;
import com.yyc.ctci.ch4.Graph;
import com.yyc.ctci.ch4.Node;

public class G4G_Q1_detectCycleTest {

	public Graph g;
	public Graph g2;
	
	@Before
	public void setUp() throws Exception {
		g = new Graph();

		Node a =new Node("a");
		Node b =new Node("b");
		Node c =new Node("c");
		Node d =new Node("d");
		Node e =new Node("e");
		Node f =new Node("f");
		
		a.addChild(b);
		b.addChild(d);
		c.addChild(b);
		c.addChild(f);
		d.addChild(c);
		d.addChild(e);
		
		g.addNode(a);
		g.addNode(b);
		g.addNode(c);
		g.addNode(d);
		g.addNode(e);
		g.addNode(f);
		
		g2 = new Graph();
		
		Node x =new Node("x");
		Node y =new Node("y");
		Node z =new Node("z");
		
		x.addChild(y);
		x.addChild(z);
		
		g2.addNode(x);
		g2.addNode(y);
		g2.addNode(z);
		
	}
	
	@After
	public void tearDown() throws Exception {
		g = null;
		g2 = null;
	}
	
	@Test
	public void detectCycleTest() {
		G4G_Q1_detectCycle detectCycle = new G4G_Q1_detectCycle();
//		System.out.println("---->g  has cycle: " + detectCycle.checkCycle(g));
//		System.out.println("---->g2 has cycle: " + detectCycle.checkCycle(g2));
		assertTrue(detectCycle.checkCycle(g));
		assertFalse(detectCycle.checkCycle(g2));	
	}
}
