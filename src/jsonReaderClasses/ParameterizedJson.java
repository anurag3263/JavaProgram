package jsonReaderClasses;

public class ParameterizedJson {

	public static void main(String[] args) {
		
		String name = "Anurag";
		int age = 18;
		boolean is_student = false;
		float gpa = 3.75f;
		String city = "New York";
		int[] section = { 10, 12, 20 };
		
		String jsonFormate = """
				{
				  "name": "%s",
				  "age": %d,
				  "is_student": %b,
				  "grades": [88, 92, 95],
				  "section"; [%d, %d, %d],
				  "address": {
				    "city": "%s",
				    "zipcode": 10001
				  },
				  "is_employed": true,
				  "gpa": %.2f
				}
				""".formatted(name, age, is_student,section[0], section[1], section[2], city, gpa);
		
		System.out.println(jsonFormate);

	}

}
