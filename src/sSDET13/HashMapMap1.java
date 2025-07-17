package sSDET13;

import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapMap1 {

	public static void main(String[] args) {
		/**
		 * all attribute are same as hashSet but only for key
		 * it doesn't maintain insertion order (unordered collection)
		 * single null value for key
		 * it doesn't allow duplicates (value can be duplicates but key always will be unique)
		 * 
		 */

		HashMap<String, String> map=new HashMap<String, String>();
		map.put("name", "anurag");
		map.put("surname", "chaturvedi");
	//	map.put( null, null);
		map.put("name1", "abhisek");
		map.put("name2", "azbhi");
		
		System.out.println(map);
		
	//	for(String i: map.keySet()) // use this method if u only want keySet 
		
		for(String i: map.values())
		{
			System.out.println(i);
		}
		
		TreeMap<String, String> treemap= new TreeMap<String, String>(map);
		
		System.out.println(treemap.keySet()); //by default treeMap will sort the data based on key
		
		System.out.println(treemap.values());
		
		System.out.println(treemap.descendingKeySet());// reversing the key
		
		Collection<String> values1 = treemap.values(); // to sort values in ascending order
		 
		TreeSet<String> treeset=new TreeSet<String>(values1);
		
		System.out.println(treeset);
		
		
		
	}

}
