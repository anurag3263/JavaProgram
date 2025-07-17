package constructorChaining;

public class BB extends AA {
	
	BB(int age)
	{
		super();
		System.out.println("BB class parameterized constructor");
	}
	BB()
	{
		
		this(24);
		System.out.println("BB class default constructor");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("BB class main method");
		BB b=new BB();
	

	}

}
