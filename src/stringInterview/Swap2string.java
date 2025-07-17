package stringInterview;

public class Swap2string {

	public static void main(String[] args) {
		String s1="anurag", s2="chaturvedi"; //temp="";
		
		/*temp=s1;
		s1=s2;
		s2=temp;
		
		System.out.println(s1+  "   "+s2); */
		
		
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("after swapping: ==="+s1+  "  "+s2);

	}

}
