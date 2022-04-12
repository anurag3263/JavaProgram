package Start1;

public class ConsonantsVowel {

	public static void main(String[] args) {
		String s="Address-3005/A1,Benguluru,Pincode 231006";
		s=s.toLowerCase();
		int consonants=0,vowel=0,number=0,spaces=0;
		
		for (int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowel++;
			}else if (ch>='a' && ch<='z') {
				consonants++;
			}else if (ch>='0' && ch<='9')
			{
				number++;
			}else if (ch==' ')
			{
				spaces++;
			}
			
		}
		System.out.println("Consonants in given String: "+consonants+" ");
		System.out.println("vowels in given String: "+vowel+" ");
		System.out.println("Num in given String: "+number+" ");
		System.out.println("Spaces in given String: "+spaces+" ");
	}

}
