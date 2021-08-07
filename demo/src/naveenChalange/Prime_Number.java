package naveenChalange;

public class Prime_Number {

	public static void main(String[] args) {
		// 13 is prime number because  13 is divided by 1 or 13
		
		int num=11;
		boolean flag=false;
		
		for(int i=2; i<=num/2;i++) {
			if(num%i==0){
				flag=true;
				break;
			}
		}
          if(flag) {
        	  System.out.println(num+"  is not a prime number");
          }
          else {
        	  System.out.println(num+"  is  a prime number");
          }
	}

}
