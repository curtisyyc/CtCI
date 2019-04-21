package com.yyc.ctci.ch3.q6;

public class InvalidAnimalTypeException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidAnimalTypeException(){
		super();
	}
	
	public InvalidAnimalTypeException(String message){
		super(message + "The selter only holds Dog or Cat. ");
	}
	
}
