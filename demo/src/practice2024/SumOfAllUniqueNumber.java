package practice2024;

import java.util.HashSet;
import java.util.Set;

public class SumOfAllUniqueNumber {

	public static void main(String[] args) {
		String input = "1,2,a,2,3";
		long sum = 0;

		if (input == null || input.isEmpty()) {
			System.out.println("Enter correct string");
		}
		Set<Integer> uniqueNumbers =new HashSet<Integer>();
		String[] numbers = input.split(",");
        for(String str :numbers) {
        	str=str.trim();
    //    	System.out.println(str);
        	
        	if(str.isEmpty()) {
        		continue;
        	}
        	try {
        		int num =Integer.parseInt(str);
        		if(!uniqueNumbers.contains(num)) {
        			uniqueNumbers.add(num);
        			sum +=num;
        		}
        		
        	}catch (NumberFormatException e) {
			//	System.err.println("Invalid Numbers : "+str);
			}
        }
        System.out.println("Sum of All Unique Numbers : "+sum);
	}
}
