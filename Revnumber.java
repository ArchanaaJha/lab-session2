package com.src;

// WAP to find reverse of number
import java.util.Scanner;

public class Revnumber {
	public static void main(String[]args) {
		
		int number =24679, reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	
	}  
	
		}
		
		
	

