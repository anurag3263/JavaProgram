package array;

public class PrintingMaxStrFromArray {

	public static void main(String[] args) {
		String[] str= {"anurag","chaturvedi","ravi","tom"};
		
		String max=str[0];
		
		for(int i=1;i<str.length;i++)
		{
			if(str[i].length()>max.length())
			{
				max=str[i];
			}
		}
		System.out.println(max);
	}

}
