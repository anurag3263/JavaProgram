package leetCode;

import java.util.HashSet;

public class StringOccurances {

	public static void main(String[] args) {
		
		String s="Allahabad";
		s=s.toLowerCase();
		char[] ch=s.toCharArray();
		System.out.println(ch);
		
		HashSet<Character> set=new HashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		System.out.println(set);
		
		for(Character cha:set) {
			int count=0;
			for (int i = 0; i < ch.length; i++) {
				if (cha==ch[i]) {
					count++;
				}
			}
			if (count>1) {
				System.out.println(cha+" == "+count );
			}
			
		}

	}

}
