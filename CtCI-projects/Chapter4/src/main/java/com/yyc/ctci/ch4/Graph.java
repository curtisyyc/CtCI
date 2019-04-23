package com.yyc.ctci.ch4;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private List<Node> nodes;
	
	public Graph() {
		super();
		nodes = new ArrayList<Node>();
	}
	
	public Graph(List<Node> nodes) {
		super();
		this.setNodes(nodes);
	}

	public List<Node> getNodes() {
		return nodes;
	}
	
	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}

	public void addNode(Node node){
		nodes.add(node);
	}
	
	public Node getNode(String name){
		for(Node n:nodes){
			if(name.equalsIgnoreCase(n.getName())){
				return n;
			}
		}
		return new Node();
	}
}
