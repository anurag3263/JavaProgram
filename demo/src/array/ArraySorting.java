package array;

public class ArraySorting {

	public static void main(String[] args) {
		
		int[] arr= new int[] {10,20,30,15,5,50};
		System.out.println("array before sorting===");
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++)
		{
			  for(int j=i+1;j<arr.length;j++)
			  {
				  if(arr[i]>arr[j])
				  {
					  int temp=arr[i];
					  arr[i]=arr[j];
					  arr[j]=temp;
				  }
			  }
		}
		System.out.println();
		System.out.println("array ater sorting===");
		for(int i=0;i<arr.length;i++) 
		{
			  System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("minimum element of array==");
		
		  System.out.println(arr[0]);
		  
		  System.out.println("max element of array==");
		  System.out.println(arr[arr.length-1]);
	}

}
