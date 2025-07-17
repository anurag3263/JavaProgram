package practice2024;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

	public static void main(String[] args) {
		 String str = "Alice is girl and Bob is boy";
	        String[] word =str.split(" ");
	        Map<String, Integer> hashMap = new HashMap<>();
	        for( String w : word){
	            if(hashMap.containsKey(w)){
	                hashMap.put(w,hashMap.get(w)+1);
	            }else{
	                hashMap.put(w,1);
	            }
	        }
	        System.out.println(hashMap);
	        System.out.println("Try programiz.pro");

	}

}
