package com.yyc.ctci.ch3;

public class EmptyStackException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmptyStackException() {
		super();
		
	}

	public EmptyStackException(String message) {
		super(message);
	}
	

}
