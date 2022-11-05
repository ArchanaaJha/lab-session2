/*program: program to find to compare two sets and retain elements which are same on both sets.
	 (Using retainAll method).
*/ 
package com.src;
	import java.util.*;

	class Sets{

		public static void main(String[] args)
		{
			HashSet<String> h_set1 = new HashSet<String>();
	    // use add() method to add values in the hash set
	    h_set1.add("brown");
	    h_set1.add("Green");
	    h_set1.add("Black");
	    h_set1.add("White");
	    System.out.println("Frist HashSet content: "+h_set1);//printing first set 
	    HashSet<String>h_set2 = new HashSet<String>();//adding elements in 2nd set
	    h_set2.add("brown");
	    h_set2.add("red");
	    h_set2.add("Black");
	    h_set2.add("Orange");
	    //comparing the element of both the set
	    System.out.println("Second HashSet content: "+h_set2);
	    h_set1.retainAll(h_set2);
	    //printing the same element 
	    System.out.println("HashSet content:");
	    System.out.println(h_set1);
	    }
	}

