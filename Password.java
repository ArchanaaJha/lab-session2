package com.src;

//WAP to check the condition for checking the correct password using if else.
import java.util.Scanner;
public class Password{
	public static void main(String[] args)
	{
	  //create an object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//take a input from the user
	System.out.println("Enter a password:");
    int num=sc.nextInt();
    
  // TODO AUTO generated method stub
		if(num==6789) {
			System.out.println("correct");
		}
		else {
			System.out.println("wrong password");
		}
		}
}
