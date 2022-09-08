package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "We learn java basics as part of java sessions in java week1";
	String[] split = str.split(" ");
	for (int i =0; i<split.length; i++) {
		int count = 0;
		for (int s=i+1; s<split.length; s++) {
			if(split[i].equals(split[s])) 
			{
				count++;
			}
		if (count>=1) {
			split[i] = "";
			
		}
		for (int k=0; k<split.length;k++) {
			System.out.print(split[k]+" ");
	
		}
	}
	}}}











/*
 * Pseudo code 
 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 
 
 * g) Displaying the String without duplicate words	
 */