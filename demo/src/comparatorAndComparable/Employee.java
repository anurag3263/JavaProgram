package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(12);
		nums.add(89);
		nums.add(18);
		nums.add(24);

		System.out.println("Before Sorting ---> " + nums);
		Collections.sort(nums);
		System.out.println("After Sorting ---> " + nums);

		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 % 10 > o2 % 10) {
					return 1;
				} else {
					return -1;
				}
			}
		};
		Collections.sort(nums, com);
		System.out.println("After Using Comparator ---> " + nums);

	}

}
