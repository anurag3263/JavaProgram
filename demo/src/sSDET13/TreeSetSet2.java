package sSDET13;

import java.util.TreeSet;

public class TreeSetSet2 {

	public static void main(String[] args) {
		
		TreeSet set= new TreeSet<String>();
		
		set.add(10);
		set.add(5);
		set.add(20);
		
		//set.add(null);// does not allow null value and gives  " java.lang.NullPointerException "
		
		//set.add("anu");  // because it support only homogeneous element
		
		System.out.println(set); // data structure is balance tree so by default is will sort data into ascending order
		
		
		System.out.println(set.descendingSet()); // for reversing the set
		
		
	}

}
