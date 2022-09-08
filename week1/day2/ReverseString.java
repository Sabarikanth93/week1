package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Hello";

char[] chArray = str.toCharArray();
for(int i=chArray.length-1; i>=0; i--) {
		System.out.println(chArray[i]);
	}
}
	}
