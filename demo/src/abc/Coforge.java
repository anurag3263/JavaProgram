package abc;

public class Coforge {

	public static void main(String[] args) {
		 String ip = "Ran Vijay";
	//		Output: "naR yijaV"
		 
		 String[] wordStrings = ip.split(" ");
		 StringBuilder sb = new StringBuilder();
		 
		 for(String word : wordStrings) {
			 char first = word.charAt(0);
             char last = word.charAt(word.length() - 1);
             sb.append(last);
             sb.append(word.substring(1, word.length() - 1));
             sb.append(first);
			 sb.append(" ");
		 }
		 System.out.println(sb.toString());
		
	}

}