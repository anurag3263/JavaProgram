package interviewPractice;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 2, 5, 6, 8, 9 };
		int temp = 0;
		// Displaying elements of original array
		System.out.println("element of original array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Sort the array in ascending order

		
		  for(int i=0;i<arr.length;i++) 
		  { 
			  for(int j=i+1;j<arr.length;j++) 
			  {
		  if(arr[i]>arr[j])
		  { 
			  temp=arr[i]; 
			  arr[i]=arr[j]; 
			  arr[j]=temp; 
			  }
		  }
			  }
		  System.out.println();
		  
		  //Displaying elements of array after sorting
		  System.out.println("Elements of array sorted in ascending order: "); 
		  for (int i =0; i< arr.length; i++)
		  { 
			  System.out.print(arr[i] + " "); 
			  } 
		  
		 

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();

		// Displaying elements of array after sorting
		System.out.println("Elements of array sorted in descending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}