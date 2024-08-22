package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudentDetails1 implements Comparable<StudentDetails1> {
	int age;
	String name;

	public StudentDetails1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentDetails [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(StudentDetails1 that) {
//		if (this.name.length() > that.name.length()) {
//	        return 1;
//	    } else if (this.name.length() < that.name.length()) {
//	        return -1;
//	    } else {
//	        return 0;
//	    }

		// or use like below
		return Integer.compare(this.name.length(), that.name.length());
	}

}

public class StudentComparable {

	public static void main(String[] args) {
		List<StudentDetails1> studs = new ArrayList<>();
		studs.add(new StudentDetails1(21, "Divya"));
		studs.add(new StudentDetails1(18, "Komal Kumari"));
		studs.add(new StudentDetails1(25, "Hemlata"));
		studs.add(new StudentDetails1(24, "Pooja Gaur"));
		studs.add(new StudentDetails1(21, "Pooja"));

		Collections.sort(studs);
		System.out.println(studs);

	}

}
