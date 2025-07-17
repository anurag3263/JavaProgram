package array;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayListSorting {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(50);
		
		System.out.println("Before sorting");
		System.out.println(list);
		
		TreeSet<Integer> set=new TreeSet<Integer>(list);
		
		System.out.println("After sorting");
		System.out.println(set);
		
		set.addAll(list);
		System.out.println(list);
		

	}

}
