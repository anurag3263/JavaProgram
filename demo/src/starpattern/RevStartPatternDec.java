package starpattern;

public class RevStartPatternDec {

	public static void main(String[] args) {
		
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*" + " ");
				// in place of star put i if you want to print number
			}
			System.out.println();
		}

	}

}
