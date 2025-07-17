package practice2024;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTraversing {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<>();
		map.put("anurag", "10");
		map.put("Rohit", "45");
		
		for(Entry<String, String> string :map.entrySet()) {
			System.out.println(string.getKey()+"  : "+string.getValue());
		}
//		        Key :Rohit = Value : 45
//				Key :anurag = Value : 10
	
	}

}
