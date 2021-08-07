package array;

public class AddTwoArray {

	public static void main(String[] args) {
		
		int[] a= new int[] {3,4,5};
		int[] b= new int[] {4,4,5,6};
		
		int size=a.length;
		if(size<b.length)
		{
			size=b.length;
		}
		for(int i=0; i<size;i++)
		{
			try {
				System.out.println(a[i]+b[i]);
			}
			catch(Exception e)
			{
				try {
				System.out.println(b[i]);
			}
				catch(Exception e1)
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
