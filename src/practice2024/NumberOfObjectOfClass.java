package practice2024;

public class NumberOfObjectOfClass {
	
static int numOfObjects=0;

public NumberOfObjectOfClass() {
	numOfObjects++;
}

	public static void main(String[] args) {
		
		NumberOfObjectOfClass e1=new NumberOfObjectOfClass();
		NumberOfObjectOfClass e2=new NumberOfObjectOfClass();
		NumberOfObjectOfClass e3=new NumberOfObjectOfClass();
		NumberOfObjectOfClass e4=new NumberOfObjectOfClass();
		
		System.out.println("Number of objects : "+numOfObjects);
	}
	

}
