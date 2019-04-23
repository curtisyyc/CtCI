package com.yyc.ctci.ch4;

import java.util.HashSet;
import java.util.LinkedList;

import com.yyc.ctci.ch4.Node.State;

/**
 * Given a directed graph, check whether the graph contains a cycle or not. 
 * Your function should return true if the given graph contains at least one
 * cycle, else return false. For example, the following graph contains three
 * cycles 0->2->0, 0->1->2->0 and 3->3, so your function must return true.<br><br>
 * <b>See</b> <a href="https://www.geeksforgeeks.org/detect-cycle-in-a-graph/">https://www.geeksforgeeks.org/detect-cycle-in-a-graph/</a><br><br>
 * 
 * The pseudocode below implements DFS<br>
 * 
 * <pre>
 * void search(Node root){
 *   if (root == null) return;
 *   visit(root);
 *   root.visited = true;
 *   for each (Node n in root.adjacent) {
 *     if (n.visited == false) {
 *       search(n);
 *     }
 *   }
 * }
 * </pre>
 * 
 * @author YYC
 *
 */
public class G4G_Q1_detectCycle {

	public boolean checkCycle(Graph g){
		if(g.getNodes() == null) 
			return false;
		
		for(Node node : g.getNodes()){
			for(Node n : g.getNodes()){
				n.setState(State.Unvisited);
			}
			System.out.println("----------------------");
			if(searchCycle(node) == true){
				return true;
			}
		}
		return false;
	}

	private boolean searchCycle(Node node) {
//		if(node == null)
//			return false;
		node.setState(State.Visited);
		System.out.println(node.getName());
		for(Node c : node.getChildren()){
			if(c.getState() == State.Visited){
				System.out.println(c.getName() + " <--- Detect cycle. ");
				return true;
			}
			if(c.getState() == State.Unvisited){
				return searchCycle(c);
			}
		}
		return false;
	}
	
	
}
