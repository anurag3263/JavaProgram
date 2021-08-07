package naveenChalange;

public class Palindrome_Number {

	public static void main(String[] args) {
		// 121=121
		
		int num=122;
		int rev=0;
		int actualNum=num;
		
		while(num!=0) {
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
           System.out.println(rev);
           
           if(actualNum==rev) {
        	   System.out.println(actualNum+"  is a polindrome");
           }
           else {
        	   System.out.println(actualNum+"  is not a polindrome");
           }
	}

}
