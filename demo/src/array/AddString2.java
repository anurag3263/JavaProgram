package array;

public class AddString2 {

	public static void main(String[] args) {
		String s="xyz"+"abc";
		String s1=s;
		for(int i=0;i<s1.length()/2;i++)
		{
		String res=(s1.charAt(i)+""+s1.charAt(s1.length()/2+i));
		System.out.print(res);
		}
          
	}

}
