package com.yyc.ctci.ch3.q6;

public class Dog extends Animal {

	public Dog(String n) {
		super(n);
	}

	@Override
	public String name() {
		return "Dog: " + name;
	}

}
