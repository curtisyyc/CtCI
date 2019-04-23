package com.yyc.ctci.ch4;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	private String name;
	private List<Node> children;
	private State state;
	public enum State {
		Unvisited, Visited, Visiting;
	}
	
	public Node(List<Node> children, String name) {
		super();
		this.name = name;
		this.children = children;
	}

	public Node(String name) {
		super();
		this.name = name;
		children = new ArrayList<Node>();
		state = State.Unvisited;
	}

	public Node() {
		super();
		name = "";
		children = new ArrayList<Node>();
		state = State.Unvisited;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	public void addChild(Node child){
		this.children.add(child);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
}
