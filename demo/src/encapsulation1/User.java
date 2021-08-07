package encapsulation1;

public class User {
	private	String UserName;
	private	String Password;
	private	byte age;
	
	public void setUserName(String UserName) {
		System.out.println("Data set on UserName");
		this.UserName=UserName;
	}
	public void setPassword(String Password) {
		
	if(Password.length()>=8) {
		System.out.println("Data set on Password");
		this.Password=Password;
}else {
	System.out.println("data can't be set as password");
}
	}
	public void setage(byte age) {
		if(age>0) {
		System.out.println("Data set on Age");
		this.age=age;
}else {
	System.out.println("age can't be set");

}
	}
	public String getUserName() {
		System.out.println("user name data return");
		return UserName;
		
	}
	public String getPassword() {
		System.out.println("Password data return");
		return Password;
	}
	public byte getage() {
		System.out.println("age data return");
		return age;
	}
}