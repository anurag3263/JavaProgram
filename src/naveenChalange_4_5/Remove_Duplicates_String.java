package naveenChalange_4_5;

import java.util.LinkedHashSet;

public class Remove_Duplicates_String {

	public static void main(String[] args) {
		String s="xzanuragn";
		
		LinkedHashSet<Character> lh=new LinkedHashSet<Character>();
		
		for(int i=1;i<=s.length();i++) {
			lh.add(s.charAt(i-1));
		}
		for(Character ch:lh) {
	    System.out.print(ch+"");	 
	}
	}
	}
