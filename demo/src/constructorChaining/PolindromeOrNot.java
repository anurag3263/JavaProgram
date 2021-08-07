package constructorChaining;

public class PolindromeOrNot {

	public static void main(String[] args) {
		int n=121,rev=0;
		int actualNum=n;
		System.out.println("Original number is :--  "+n);
		while(n!=0) {
		int num=n%10;
		rev=rev*10+num;
		n=n/10;
		}
		//System.out.println(rev);
		
		if(actualNum==rev)
		{
			System.out.println("Number is polindrome==="+rev);
		}else
		{
		System.out.println("Number is not polindrome==="+rev);
		}
	}

}
