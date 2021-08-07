package constructorChaining;

import java.util.ArrayList;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(400);
		list.add(10);
		list.add(50);
		
		System.out.println("element of arraylist before sorting");
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)>list.get(j))
				{
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		System.out.println("element of arraylist after sorting");
		System.out.println(list);
	}

}
