/*
 program: program to find to change PriorityQueue to maximum Priorityqueue Using Any loop
 */
package com.src;

import java.util.*;

class Priority {

	public static void main(String[] args)
	{ // Creating an object of PriorityQueue class
		PriorityQueue<Integer> object = new PriorityQueue<>(Collections.reverseOrder());
	      
		   // Add numbers in the Queue
		object.add(12);
		object.add(28);
		object.add(45);
		object.add(34);
		object.add(18);
		object.add(79);
		object.add(83);
		object.add(89);
		object.add(13);
		
			//Printing Original priority queue
		   System.out.println("Original Priority Queue: "+object);
		   	   System.out.println("Original Priority Queue: "+object);

//Printing Maximum priority Queue
System.out.print("Maximum Priority Queue");
		Integer val = 10;
		//using while loop
		while( ( val = object.poll()) != null) {
		    System.out.print(val+"  ");
		      }
			  System.out.print("\n");
}
}
