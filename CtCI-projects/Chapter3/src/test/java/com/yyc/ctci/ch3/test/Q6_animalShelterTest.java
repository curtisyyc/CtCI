package com.yyc.ctci.ch3.test;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yyc.ctci.ch3.q6.Cat;
import com.yyc.ctci.ch3.q6.Dog;
import com.yyc.ctci.ch3.q6.Fox;
import com.yyc.ctci.ch3.q6.Q6_animalShelter;

public class Q6_animalShelterTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void animalShelterTest() {
		Q6_animalShelter shelter = new Q6_animalShelter();
		shelter.checkShelter();
		
		shelter.enqueue(new Dog("D1"));
		shelter.enqueue(new Dog("D2"));
		shelter.enqueue(new Cat("C1"));
		shelter.enqueue(new Dog("D3"));
		shelter.enqueue(new Cat("C2"));
		shelter.enqueue(new Dog("D4"));
		shelter.checkShelter();
		
		try {
			shelter.enqueue(new Fox("F1"));
		} catch (Exception e) {
			System.err.println(e.toString() + "  ");
		}
		
		System.out.println("dequeueCat -> " + shelter.dequeueCat().name());	
		System.out.println("dequeueAny -> " + shelter.dequeueAny().name());
		
		shelter.checkShelter();
		
	}
}
