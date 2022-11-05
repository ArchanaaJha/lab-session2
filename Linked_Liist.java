/*
 program: program to find to check if a particular element exist in a Linked List
 
 */
package com.src;

import java.util.*;
class Linked_Liist {

	public static void main(String[] args)
	{  Scanner sc =new Scanner (System.in);
	//creating Linkedlist
		LinkedList<Integer> ob= new LinkedList<>();
		//adding object in Linkedlist
	    ob.add(6);
	    ob.add(4);
	    ob.add(2);
	    ob.add(4);
	  //printing the Linkedlist
	    System.out.println("enter the element you want to search:");
	    int n=sc.nextInt();
	    //checking the element 
	    boolean s= ob.contains(n);
	    if(s)
	    {
	    	System.out.println("yes the element is present");
	    }
	    else
	    {
	    	System.out.println("no the element is not present");
	    }
    }
}
