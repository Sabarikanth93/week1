package week1.day1;

public class Fibbinocci {
 public static void main(String [] args) {
	 int firstNum = 0;
	 int secNum = 1;
	 int sum = 0;
	 for (int i=2; i<=11; i++) {
 sum = firstNum + secNum;
 firstNum = secNum;
 secNum = sum;
 System.out.println(sum);
	 }
 }
 }





//0 1 1 2 3 5 8 13 21 35 56

/* Saturday Home Assignments 
Home Assignment 1: Print Fibbinocci series for first 11 numbers

0 1 1 2 3 5 8 13 21 35 56 

Goal: To understand the arthimetic operation and loop

a) Create a class by name: Fibbinocci
b) Create a main method using shortcut
c) Write a logic to print fibbinocci from 0 to 56

Hints: 

Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
Print first number
Iterate from 1 to the 11
Add first and second number assign to sum
Assign second number to the first number
Assign sum to the second number
Print sum */