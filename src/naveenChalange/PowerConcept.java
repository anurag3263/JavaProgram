package naveenChalange;

public class PowerConcept {

	public static void main(String[] args) {
		// 3^4=81
		
		int base=2;
		int exponent=5;
		
		/*
		 * long result=1;
		 * 
		 * while(exponent!=0) {
		 *  result *=base;// result*base;
		 *   --exponent;
		 *    }
		 * System.out.println(result);
		 */
          
          // there is a method by which u can achieve this also
          
          System.out.println(Math.pow(base, exponent));
	}

}
