package interviewPractice;

public class ReverseString {
	
	//There are 4 ways to reverse a string in java

	//1. using for loop and charAt
	public static void main(String[] args) 
	{
		String s="Anurag";
		
		/*
		 * String reverse=""; 
		 * for(int i=s.length()-1;i>=0;i--)
		 *  {
		 * reverse=reverse+(s.charAt(i));
		 *  } 
		 *  System.out.println(reverse);
		 */
		
		//2.By using tocharArray
		char[] ch=s.toCharArray();
		System.out.println("reverse of string is");
		
	
	for(int i=ch.length;i>0;i--)
	{
		System.out.print(ch[i-1]);
	}

		
		//2.By using StringBuffer and
		
		/*
		 * StringBuffer sb=new StringBuffer(s); 
		 * System.out.println(sb.reverse());
		 */
       
		//3.StringBuilder class
		/*
		 * StringBuilder sbu =new StringBuilder(s); 
		 * System.out.println(sbu.reverse());
		 */
	}

}
