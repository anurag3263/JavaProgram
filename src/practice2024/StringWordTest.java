package practice2024;

public class StringWordTest {

	public static void main(String[] args) {
		String s="Anurag Chaturvedi";
        String[] word=s.split(" ");
        String op="";
//          
//        for(String w :word) {
//        	StringBuffer sb=new StringBuffer(w);
//        	sb.reverse();
//        	op+=sb.toString()+" ";
//        }
//        
//        System.out.print(op);
//    
        for(int i=0;i<word.length;i++) {
        	char[] ch=word[i].toCharArray();
        	for(int j=ch.length-1;j>=0;j--) {
        		System.out.print(ch[j]);
        	}
        	System.out.print(" ");
        }
    }
	}


