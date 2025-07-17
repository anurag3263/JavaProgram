package starpattern;

public class StarPattern {

	public static void main(String[] args) {
		
		/*
		 *  1
		 *  2 2
		 *  3 3 3 
		 *  4 4 4 4 
		 *  5 5 5 5 5
		 */  
		
		int num=1;
		int str=1;
		
		for(int i=0;i<5;i++) {
			for(int j=1;j<=str;j++) {
				System.out.print(num+"  ");
			}
			System.out.println(" ");
			num++;
		    str++;
		}
	}

}
