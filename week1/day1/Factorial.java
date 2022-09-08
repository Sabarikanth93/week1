package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num = 5;
     int other = 1;
     for(int i=other; i<=num; i++){
		other = other * i;
     }
	System.out.println(other);
	}
	}	
	


	
	
	// 5! = 1*2*3*4*5 = 120
	
// Dont put ; in loops at the end of the iteration declaration


//Day 1 Assignment 4:
//Find Factorial of a given number
//Goal: To understand the for loop and logic writing
//a) Create a class by name: Factorial
//b) Create a main method using shortcut
//c) Declare a class variable of type of int with a value as input
//d) Write a logic to print the factorial of the given input
//Hint: use for loop from 1 --> n and multiply with previous multiplied value