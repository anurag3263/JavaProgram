package naveenChalange;

public class Factors_OfaNumber {

	public static void main(String[] args) {
		// 10--->1 2 5  10
      
		int num=110;
		
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i+" ");
			}
		}
		
	}

}
