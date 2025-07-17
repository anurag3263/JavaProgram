package sSDET13;

public class Array {
	/**
	 * because array support only homogeneous element
	 * but we  can also add heterogeneous element by only creating object
	 * 
	 */

	public static void main(String[] args) {
		
		Object obj[]=new Object[5];
		
		obj[1]="Anurag";
		obj[2]=800522;
		obj[3]="anu120";
		
		for(int i=0; i<obj.length;i++)
		{
		System.out.println(obj[i]);
		}
	}

}
