package naveenChalange;

public class Prime_Number_Interval {

	public static void main(String[] args) {
		// prime number between 20 to 50
		
		int low=10;
		int high=50;
		
		while(low<high) {
			boolean flag=false;
			
			for(int i=2; i<low/2;i++) {
				
				if(low%i==0) {
					flag=true;
					break;
				}		
			}
			
			if(!flag) {
				System.out.println(low+" ");
			}
			low++;
		}

	}

}
