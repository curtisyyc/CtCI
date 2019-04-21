package com.yyc.ctci.ch3.q6;

public class Fox extends Animal {

	public Fox(String n) {
		super(n);
	}

	@Override
	public String name() {
		return "Fox: " + name;
	}

}
