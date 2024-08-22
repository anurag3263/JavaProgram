package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentDetails {
	int age;
	String name;

	public StudentDetails(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentDetails [age=" + age + ", name=" + name + "]";
	}

}

public class Students {

	public static void main(String[] args) {
		Comparator<StudentDetails> comparator = new Comparator<StudentDetails>() {

			@Override
			public int compare(StudentDetails o1, StudentDetails o2) {
				if (o1.name.length() > o2.name.length()) {
					return 1;
				} else {
					return -1;
				}
			}
		};

		List<StudentDetails> studs = new ArrayList<>();
		studs.add(new StudentDetails(21, "Divya"));
		studs.add(new StudentDetails(18, "Komal Kumari"));
		studs.add(new StudentDetails(25, "Hemlata"));
		studs.add(new StudentDetails(24, "Pooja Gaur"));
		
		Collections.sort(studs,comparator);
		System.out.println(studs);

	}

}
