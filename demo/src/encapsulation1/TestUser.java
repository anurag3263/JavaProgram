package encapsulation1;


public class TestUser {// encapsulation with getter and setter method

	public static void main(String[] args) {
		User usr=new User();
		usr.setUserName("ANURAG");
		usr.setPassword("ANURAG134");
		usr.setage((byte)23);
		System.out.println(usr.getUserName());
		System.out.println(usr.getPassword());
		System.out.println(usr.getage());

	}

}
