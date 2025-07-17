package stringInterview;

import java.util.LinkedHashSet;

public class RemoveDup {

	public static void main(String[] args) {


		String s="allahabad";  //alhbd
		char[]	ch=s.toCharArray();
		
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0; i<ch.length;i++)
		{
			set.add(ch[i]);
		}
            System.out.println(set);//[a, l, h, b, d]
		for (Character character : set) {
			
			System.out.print(character);
			
		}
	}

}
