package stringInterview;

import java.util.HashSet;

public class StringDupicateOccurance {

	public static void main(String[] args) {
		
		String s="allahabad";
		
		char [] ch= s.toCharArray();
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i=0; i<ch.length;i++)
		{
			set.add(ch[i]);
		}
        System.out.println(set);
        
        for(Character cha : set)
        {
        	int count=0;
        	for(int i=0;i<ch.length;i++)
        	{
        		if(cha==ch[i])
        		{
        			count++;
        		}
        	}
        	System.out.println(cha+"  == "+count);
        }
	}

}
