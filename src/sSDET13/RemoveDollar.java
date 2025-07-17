package sSDET13;

public class RemoveDollar {

	public static void main(String[] args) {
		String dollar= "$9,99.00";
		String rupiya= "₹7,77.00";
		String hashtag= "#66,66.00";
		
		System.out.println(dollar.replaceAll("[$,]", ""));
		System.out.println(rupiya.replaceAll("[₹,]", ""));
		System.out.println(hashtag.replaceAll("[#,]", ""));
	}

}
