package practice2024;

import java.util.HashSet;

public class StringInt {

	public static void main(String[] args) {
		String string="allahabad";
		char[] ch=string.toCharArray();
		
		HashSet<Character> set= new HashSet<Character>();
		
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}
		System.out.println(set);
		
		for (Character character : set) {
			int count=0;
			for(int i=0;i<ch.length;i++) {
				if (character==ch[i]) {
					count++;
				}
			}
			System.out.println(character+" has occurance : "+count);
			
		}

	}

}
