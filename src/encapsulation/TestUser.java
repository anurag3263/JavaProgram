package encapsulation;

public class TestUser {// without  getter and setter method

	public static void main(String[] args) {
		User usr=new User();
		usr.UserName="ANURAG";
		usr.Password="ANURAG1234";
		usr.age=23;
		System.out.println(usr.UserName);
		System.out.println(usr.Password);
		System.out.println(usr.age);
		
		

	}

}
