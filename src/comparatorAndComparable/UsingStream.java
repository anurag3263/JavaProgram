package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Emp {
	int id;
	String name;

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

public class UsingStream {

	public static void main(String[] args) {
		Comparator<Emp> empComparator = (i, j) -> i.name.length() > j.name.length() ? 1 : -1;

		List<Emp> emps = new ArrayList<>();
		emps.add(new Emp(21, "Divya"));
		emps.add(new Emp(18, "Komal Kumari"));
		emps.add(new Emp(25, "Hemlata"));
		emps.add(new Emp(24, "Pooja Gaur"));
		emps.add(new Emp(21, "Pooja"));

		Collections.sort(emps, empComparator);

		for (Emp string : emps) {
			System.out.println(string);
		}
	}

}
