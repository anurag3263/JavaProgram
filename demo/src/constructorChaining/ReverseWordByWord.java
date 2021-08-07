package constructorChaining;

public class ReverseWordByWord {

	public static void main(String[] args) {
		String s="welcome to India";
		String[]	 str=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			String str1=str[i];
			for(int j=str1.length()-1;j>=0;j--)
			{
				System.out.print(str1.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
