package interviewPractice;
import java.util.*;
public class ArrayList_string {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("anurag");
		list.add("navneet");
		list.add("bikku");
		list.add("zeno");
		
		System.out.println("before shuffling the element: "+list);
		Collections.shuffle(list);
		System.out.println("after shuffling the element: "+list);
		
		Collections.sort(list);
		System.out.println("after sorting the element: "+list);
		

	}

}
