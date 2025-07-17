package sSDET13;

import java.util.LinkedHashSet;

public class RemoveDuplFromNum {

	public static void main(String[] args) {
		int n=12598888;
		Integer num=n;
		String s = num.toString();
		System.out.println(s);
		char[] ch=s.toCharArray();
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		for (Character cha : set) {
			System.out.print(cha);		
		}
	}
}
