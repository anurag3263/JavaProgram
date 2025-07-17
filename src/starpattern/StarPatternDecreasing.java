package starpattern;

public class StarPatternDecreasing {

	public static void main(String[] args) {
		
//		* * * * * * 
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 

		
		for (int i=0; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*"+" ");
				// in place of star put i if you want to print number
			}
			System.out.println();
		}
	}

}
