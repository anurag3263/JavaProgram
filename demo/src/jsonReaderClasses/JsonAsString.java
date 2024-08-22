package jsonReaderClasses;

public class JsonAsString {

	public static void main(String[] args) {
		String json = "{\n"
				+ "  \"name\": \"Alice\",           // String\n"
				+ "  \"age\": 28,                 // Integer\n"
				+ "  \"is_student\": false,       // Boolean\n"
				+ "  \"grades\": [88, 92, 95],    // Array\n"
				+ "  \"address\": {               // Object\n"
				+ "    \"city\": \"New York\",\n"
				+ "    \"zipcode\": 10001\n"
				+ "  },\n"
				+ "  \"is_employed\": true,       // Boolean\n"
				+ "  \"gpa\": 3.75                // Float\n"
				+ "}\n"
				+ "" ;
		
		
		System.out.println(json);
		
		
		String jsonFormate = """
				{
				  "name": "Alice",
				  "age": 28,
				  "is_student": false,
				  "grades": [88, 92, 95],
				  "address": {
				    "city": "New York",
				    "zipcode": 10001
				  },
				  "is_employed": true,
				  "gpa": 3.75
				}
				""";
		
		System.out.println(jsonFormate);

	}

}
