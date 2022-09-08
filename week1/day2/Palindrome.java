package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "madam";
String rev = " ";
int length = str.length();
for (int i = length -1; i>=0;i--) {
    if (str.equals(rev))
        System.out.println("madam is a Palindrome");
     else
        System.out.println("madam is not a Palindrome");
	break;
}

	}

}
