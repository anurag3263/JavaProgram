package naveenChalange;

public class Reverse_Number {

	public static void main(String[] args) {
		//1234=  4321
		
		int num=1234;
		int rev=0;
		while(num!=0) {
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		System.out.println("reverse number is: "+rev);
	}

}
