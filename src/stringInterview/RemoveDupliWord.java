package stringInterview;

import java.util.LinkedHashSet;

public class RemoveDupliWord {

	public static void main(String[] args) {


		String s="welcome to india welcome to ";
		
		String[] ch=s.split(" ");
		
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		//System.out.println(set); //[welcome, to, india]
		
		for (String string : set) {
			System.out.print(string+" ");
			
		}

	}

}
