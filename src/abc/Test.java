package abc;

public class Test {

	public static void main(String[] args) {
		int[] arr ={5,1,2,0,2,4,0,0,5,0};
		//arrange all zero after non zero
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==0) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
	}

}
