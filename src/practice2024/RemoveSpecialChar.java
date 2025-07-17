package practice2024;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String price1 = "$9,99.00";
		String price2 = "₹9,99.00";
		String price3 = "€99,99.00";

		System.out.println(price1.replaceAll("[$,]", ""));
		System.out.println(price2.replaceAll("[₹,]", ""));
		System.out.println(price3.replaceAll("[€,]", ""));

		String s = "ASmacbook!@#$%^&pro";

		System.out.println(s.replaceAll("[^0-9,a-z,A-Z]", ""));

	}

}
