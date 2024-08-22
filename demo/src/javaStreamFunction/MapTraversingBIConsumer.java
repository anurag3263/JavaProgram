package javaStreamFunction;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTraversingBIConsumer {

	public static void main(String[] args) {

		Map<String, Double> map = new HashMap<>();
		map.put("Sachin", 9.1);
		map.put("Virat", 9.4);
		map.put("Rohit", 9.2);
		map.put("Dravid", 8.1);
		map.put("shikhar", 8.5);

		/**
		 * conventional or java 7 or lower version way
		 */

		for (Entry<String, Double> entry : map.entrySet()) {
			if (entry.getValue() > 9.0) {
				System.out.println(entry.getKey() + "--->" + entry.getValue());
			}

		}

		/**
		 * With java 8 feature
		 * 
		 * @BiConsumber interface
		 */

		map.forEach((k, v) -> System.out.println(k + "-->" + v));

		// with if condition

		map.forEach((k, v) -> {
			if (v > 9.0) {
				System.out.println(k + "-->" + v);
			}
		}

		);

	}

}
