package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 1987;
		boolean bPrime = true;
		for (int i=2; i<num; i++) {
			if (num%i==0) {
				System.out.println(num +" Not a Prime Number");
			bPrime = false;
			break;
			} 
		}
		if (bPrime == true) {
			System.out.println(num +" Prime Number");
		}
		}
}

	
	/*public static void main(String[] args) {
		
int num = 17;
for (int i =2; i<num; i++) {
	if (num%i==0) {
		System.out.println("Not a Prime");
		break;
	}
	/*else {
		System.out.println("Prime");
		break;
		}
	}

}*/



/*Home Assignment 2: Print if the given number is prime

Goal: To understand the problem solving, looping and conditional statement

a) Create a class by name: IsPrime
b) Create a main method using shortcut
c) Write a logic to find if the given number is prime or not
d) Print if it is prime or not

Hint: Iterate through all numbers from 0 to (n-1) input and 
for every number check if it divides n (input). 
If we find any number that divides, print prime.
If nothing divides, then print non-prime
*/