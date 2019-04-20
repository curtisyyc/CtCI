package com.yyc.ctci.ch3;

/**
 * Describe how you could use a single array to implement three stacks.<br><br>
 * 
 * <b>Note</b><br>
 * A stack uses LIFO (last-in first-out) ordering.<br>
 * It uses the following operations:
 * <ul>
 * 		<li>push(item): Add an item to the top of the stack.</li>
 * 		<li>pop(): Remove the top item from the stack.</li>
 * 		<li>peek(): Return the top of the stack.</li>
 * 		<li>isEmpty(): Return true if and only if the stack is empty.</li>
 * </ul> 
 * 
 * @author YYC
 *
 */
public class Q1_threeInOne {

	private int stackCount = 3;
	private int stackSize; // the capacity of each stack
	private int[] values;  // the array which implement the three stack
	private int[] sizes;   // how many items are in the stack now
	
	public Q1_threeInOne(){
		this(5); // initial the stacks with size 5
	}

	public Q1_threeInOne(int stackSize){
		this.stackSize = stackSize;
		this.values = new int[stackCount * stackSize]; 
		this.sizes = new int[stackCount]; 
	}

	public void push(int stackNo, int value){
		//Check if the stack is full, throw FullStackException if the stack is full 
		if(isFull(stackNo)){
			throw new FullStackException("[Stack " + stackNo + " is full] ");
		}
		//update values
		values[indexOfTop(stackNo)+1] = value;
		//update sizes
		sizes[stackNo]++;
		
		
	}
	
	public int pop(int stackNo){
		//Check if the stack is empty, throw StackEmptyException if the stack is empty
		if(isEmpty(stackNo)){
			throw new EmptyStackException("[Stack " + stackNo + " is empty] ");
		}
		
		int valueToPop = values[indexOfTop(stackNo)];
		values[indexOfTop(stackNo)] = 0; // This is not necessary as long as the size is correct
		sizes[stackNo]--;
		
		return valueToPop;
	}
	
	public int peek(int stackNo){
		//Check if the stack is empty, throw StackEmptyException if the stack is empty
		if(isEmpty(stackNo)){
			throw new EmptyStackException("Stack " + stackNo + " is empty.");
		}
		return values[indexOfTop(stackNo)];
	}
	
	public boolean isEmpty(int stackNo){
		return sizes[stackNo] == 0;
	}
	
	public boolean isFull(int stackNo){
		return sizes[stackNo] == this.stackSize;
	}
	
	public int indexOfTop(int stackNo){
		return stackNo * stackSize + sizes[stackNo] - 1;
	}
	
	public int[] getStackValues(int stackNo){
		int items[] = new int[sizes[stackNo]];
		for(int i = 0; i < items.length; i++){
			items[i] = values[stackNo * stackSize + i];
		}
		return items;
	}
	
	public int[] getValues(){
		return values;
	}

}
