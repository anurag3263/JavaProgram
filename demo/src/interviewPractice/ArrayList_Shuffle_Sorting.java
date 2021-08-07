package interviewPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Shuffle_Sorting {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(60);
		list.add(30);
		list.add(90);
		list.add(50);
		
		System.out.println("ArrayList before shuffling the element: "+list);
		
		//System.out.println("ArrayList after shuffling the element: ");
		
		//Collections.shuffle(list);
		
		System.out.println("ArrayList after sorting the element: ");
		
		Collections.sort(list);
		
		System.out.println(list);
		

	}

}
