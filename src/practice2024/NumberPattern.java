package practice2024;

public class NumberPattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				
		/*		    1 
				   1 2 
				  1 2 3 
				 1 2 3 4 
				1 2 3 4 5 
				System.out.print(k + " ");
				*/
				
			/*	    1
				   12
				  123
				 1234
				12345
				System.out.print(k);
				*/
		/*		    1
				   22
				  333
				 4444
				55555
			*/	
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
