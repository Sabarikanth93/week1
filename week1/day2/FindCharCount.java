package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "India";
	int count = 0;
 
	int len= str.length();
     
	char ch = 'd';
     
	char[] charArray=str.toCharArray();
     for(int i=0; i<len; i++)
     {
    	 if (charArray[i]==ch)
{
	count++;
}
     }
	System.out.println(count);
	
	}

}
