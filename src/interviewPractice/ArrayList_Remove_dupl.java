package interviewPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayList_Remove_dupl {

	public static void main(String[] args) {
		
		/*ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println("list before  removing duplicates: "+al);
		
	   LinkedHashSet list=new LinkedHashSet(al);
	   
	   System.out.println("list after removing duplicates : "+list);

	*/
		ArrayList<String> as=new ArrayList<String>();
		as.add("anurag");
		as.add("zivek");
		as.add("anurag");
		as.add("vivek");
		as.add("murali");
		
		System.out.println("list before  removing duplicates: "+as);
		
		//Set<String> list=new LinkedHashSet<String>(as);
		LinkedHashSet<String> list=new LinkedHashSet<String>(as);
		
		 System.out.println("list after removing duplicates : "+list);
		

	}
}