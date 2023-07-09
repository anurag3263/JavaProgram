package sSDET13;

public class NumberOfObject {
	
	static int numOfObject=0;
	
	public NumberOfObject() {
		numOfObject++;
	}
	@SuppressWarnings("unused")

	public static void main(String[] args) {
		
		NumberOfObject obj1=new NumberOfObject();
		NumberOfObject obj2=new NumberOfObject();
		NumberOfObject obj3=new NumberOfObject();
		NumberOfObject obj4=new NumberOfObject();
		
		System.out.println("Number of Object Has been created : "+numOfObject );
	}

}
