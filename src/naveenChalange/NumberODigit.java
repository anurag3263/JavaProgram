package naveenChalange;

public class NumberODigit {

	public static void main(String[] args) {
		// 1234= 4
		//345=3
		
		int num=345;
		int count=0;
		
		while(num!=0) {
			num=num/10;   //34 3 0
			++count;
		}
         System.out.println("numer of digit:  "+count);
	}

}
