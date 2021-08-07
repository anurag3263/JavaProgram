package constructorChaining;

public class AA {
	
	AA(int rollNo)
	{
		System.out.println("AA class parameterized constructored called");
	}
	AA()
	{
		this(10);
		System.out.println("AA class default constructor called");
	}

	public static void main(String[] args) {
		
		System.out.println("AA class main method executing...");
		AA a=new AA();
		

	}

}
