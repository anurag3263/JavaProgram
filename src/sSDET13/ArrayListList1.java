package sSDET13;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListList1 {
	/**
	 * ArrayList
	 * 
	 */

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		//list.add(null);
		
		
		System.out.println(list);//insertion order is maintain  2. duplicates allowed
		
		Collections.sort(list); // sort the list in ascending order
		
		System.out.println(list);
		
		Collections.reverse(list);// for reverse order
		System.out.println(list);
		
		//System.out.println(list.get(2));// fetching data using indexing
		
		//System.out.println(list.indexOf(10));
		
		System.out.println(list.size());

	}

}
