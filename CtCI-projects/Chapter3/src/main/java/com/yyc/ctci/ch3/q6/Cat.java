package com.yyc.ctci.ch3.q6;

public class Cat extends Animal {

	public Cat(String n) {
		super(n);
	}

	@Override
	public String name() {
		return "Cat: " + name;
	}

}
