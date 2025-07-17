 package starpattern;

public class RevStartPatterSpc {

	public static void main(String[] args) {
		
		//1
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
	//put one space after star if you want to print triangle
		
		//2
		
//     	 * 
//	    * * 
//	   * * * 
//	  * * * * 
//	 * * * * *		
		
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
				// in place of star put i if you want to print number
			}
			for(int k=1; k<=i; k++) {
	//			System.out.print("*");    //1
				System.out.print("* ");   //2
			}
			System.out.println();
		}
	}

}
