package stringInterview;

public class SubStringPresent {
	
	public static boolean isSubString ( String main,String sub)
	{
		return main.matches("(.*)" +sub+ "(.*)");
	}

	public static void main(String[] args) {
		
		System.out.println(isSubString("anurag automation work", "work"));
		System.out.println(isSubString("anurag automation work", "anurag"));
		System.out.println(isSubString("anurag automation work", "testing"));

	}

}
