package week1.day2;

public class ChangeOddIndexToUpperCase {

		public static void main(String[] args) {
			String test = "changeme";
			char[] chArray = test.toCharArray();
			for (int i = 0; i < chArray.length; i++) {
				if(i%2!=0) {
					System.out.println(String.valueOf(chArray[i]).toUpperCase());
				}else {
					System.out.println(chArray[i]);
				}
			}
		}
	}

/*
Pseudo Code

* Declare String Input as Follow
 
* String test = "changeme";

* a) Convert the String to character array

* b) Traverse through each character (using loop)

* c)find the odd index within the loop (use mod operator)

* d)within the loop, change the character to uppercase, if the index is odd else don't change
 
*/
