package stringInterview;

public class ReverseWordByWord {

	public static void main(String[] args) {
		
		String s="my name is anurag";
		
		String[] str=s.split(" ");
		/*String rev="";
		
		System.out.println(s);
		
		for(int i=0;i<str.length;i++)
		{
			rev=str[i]+" "+rev;
		}
		System.out.println(rev); */
		
		System.out.println(s);
		
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
	}

}
