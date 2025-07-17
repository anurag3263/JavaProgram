package sSDET13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetSet1 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		/**
		 *HashSet
		 */
		
		HashSet list=new HashSet<String>();
		
		list.add(10);
		list.add(10);// does not duplicates
		list.add(5);
		list.add(20);
		
	//	list.add(null);
		//list.add(null);// only allow single null value
		
	//	list.add("anu"); // allow heterogeneous type of data
		
		
		
		System.out.println(list); // random order
		
		/**
		 * because it doesn't maintain insertion order we have to covert it into treeSet or arrayList
		 * before sorting it
		 */
		ArrayList list1=new ArrayList<String>(list);
		
		Collections.sort(list1);
		
		System.out.println(list1);
		
		Collections.reverse(list1);
		System.out.println(list1);
	}

}
