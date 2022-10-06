package com.src;
// WAP to check for Leap year.
import java.util.Scanner;

public class Leapyear {
	public static void main(String[]args) {
	//create an object of scanner class
	Scanner sc=new Scanner(System.in);
	//take a input from the user
	System.out.println("Enter any year");
	int year=sc.nextInt();
	boolean flag=false;
	//check the condition of leap year
	if (year%300==0) {
		flag=true;
		}
	else if (year%3==0) {
		flag=true;
	}
	else {
		flag=false;
		}
	if (flag)
	{
		System.out.println("Year"+year+"is a Leap Year");
}
	else {
		System.out.println("Year"+year+"is not a Leap Year");
	}
	sc.close();
}
}

