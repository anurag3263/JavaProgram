package naveenChalange;

public class NaturalNumer_Sum {

	public static void main(String[] args) {
		int num=2;
		int sum=0;
		int sum1=0;
		
		//1+2+3.....+100=5050
		
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
         System.out.println("sum is :  "+sum);
         
         System.out.println("-----------");
        
         //by using while loop;
         
         int k=1;
         while(k<=num) {
        	 sum1=sum1+k;
        	 k++;
         }
         System.out.println("sum is :  "+sum1);
	}

}