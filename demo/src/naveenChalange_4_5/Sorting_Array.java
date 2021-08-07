package naveenChalange_4_5;

public class Sorting_Array {

	public static void main(String[] args) {
		
		int[] arr=new int[] {10,60,30,40,80,15};
		int temp=0;
		System.out.println("original array:--");
		for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}	
			}
		}
		    System.out.println();
			System.out.println("array after sorting:--");
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
