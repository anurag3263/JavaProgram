package naveenChalange;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// 0 1 1  2 3 5 8 13......
		
		int num=10;
		int n1=0;
		int n2=1;
		
	for(int i=1;i<=num;i++) {
		System.out.println(n1);
		int sum=n1+n2;
		n1=n2;
		n2=sum;
		
	}
	}

}
