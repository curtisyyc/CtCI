package com.yyc.ctci.ch3.q6;

import java.util.LinkedList;
import java.util.Map;

import com.yyc.ctci.library.AssortedMethods;

/**
 * An animal shelter, which holds only dogs and cats, operates on a strictly "first in,
 * first out" basis. People must adopt either the "oldest" (based on arrival time) of
 * all animals at the shelter, or they can select whether they would prefer a dog or a
 * cat (and will receive the oldest animal of that type). They cannot select which
 * specific animal they would like. Create the data structures to maintain this system
 * and implement operations such as "enqueue, dequeueAny, dequeueDog, and dequeueCat".
 * You may use the built-in LinkedList data structure.<br><br>
 * 
 * <b>Note</b><br>
 * A queue uses FIFO (first-in first-out) ordering.<br>
 * It uses the following operations:
 * <ul>
 * 		<li>add(item): Add an item to the end of the list.</li>
 * 		<li>remove(): Remove the first item in the list.</li>
 * 		<li>peek(): Return the top of the queue.</li>
 * 		<li>isEmpty(): Return true if and only if the queue is empty.</li>
 * </ul>
 * 
 * @author YYC
 *
 */
public class Q6_animalShelter {

	private LinkedList<Dog> dogQueue = new LinkedList<Dog>();
	private LinkedList<Cat> catQueue = new LinkedList<Cat>();
	private int order = 0;
	
	public void enqueue(Animal animal){
		if(!isValidAnimalType(animal)){
			throw new InvalidAnimalTypeException("Sorry we do not hold a " + animal.getClass().getSimpleName() + ". ");
		}
		
		animal.setOrder(order);
		order++;
		
		if(animal instanceof Dog){
			dogQueue.add((Dog)animal);
		} else if (animal instanceof Cat){
			catQueue.add((Cat)animal);
		}
	}
	
	public Animal dequeueAny(){
		if(dogQueue.size() == 0){
			return dequeueCat();
		}
		else if(catQueue.size() == 0){
			return dequeueDog();
		}
		
		Animal dog = dogQueue.peek();
		Animal cat = catQueue.peek();

		if(dog.isOlderThan(cat)){
			return dequeueDog();
		} else {
			return dequeueCat();
		}
	}
	
	public Dog dequeueDog(){
		if(dogQueue.size() == 0) {
			throw new EmptyQueueException("There are no dogs left in the shelter.");
		}
		return dogQueue.poll();
	}
	
	public Cat dequeueCat(){
		if(catQueue.size() == 0) {
			throw new EmptyQueueException("There are no cats left in the shelter.");
		}
		return catQueue.poll();
	}
	
	public Animal peek(){
		if (dogQueue.size() == 0) {
			return catQueue.peek();
		} else if (dogQueue.size() == 0) {
			return catQueue.peek();
		}
		Animal dog = dogQueue.peek();
		Animal cat = catQueue.peek();
		if(dog.isOlderThan(cat)){
			return dog;
		} else {
			return cat;
		}
	}
	
	public boolean isEmpty(){
		return dogQueue.isEmpty() & catQueue.isEmpty();
	}
		
	private boolean isValidAnimalType(Animal a){
		if(a instanceof Dog || a instanceof Cat){
			return true;
		} else {
			return false;
		}	
	}
	
	public void checkShelter() {
		Q6_animalShelter clone = new Q6_animalShelter();

		for(int i = 0; i < dogQueue.size(); i++){
			clone.dogQueue.add(this.dogQueue.get(i));
		}
		for(int i = 0; i < catQueue.size(); i++){
			clone.catQueue.add(this.catQueue.get(i));
		}
		
		System.out.print("[");
		while (!clone.isEmpty()) {
			System.out.print("(" + clone.dequeueAny().name() + ")");
		}
		System.out.println("]");

	}
}
