package sSDET13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDateAndTime {

	public static void main(String[] args) {
		//pass the 1 in Date(1); if you want to start from beginning
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
		String date = formatter.format(d);
		String splitter[] = date.split("-");
		String month_year = splitter[1];
		String day = splitter[0]; 
		
		String month=month_year.substring(0, 3);
		String dayMonth=month+" "+day;
		System.out.println(month_year);
		System.out.println(month_year.substring(0, 3));
		System.out.println(day);
		System.out.println("Current Date : "+dayMonth);
		
		
		// Get Future Date
		
		Calendar calendar=Calendar.getInstance();
		//c.setTime(new Date()); // Now use today date.
		
		calendar.setTime(d);
		calendar.add(Calendar.DATE, 22);
		System.out.println("Future Date with Current Time : "+calendar.getTime());
		String futureDate= formatter.format(calendar.getTime());
		String split[]=futureDate.split("-"); 
		String monthName = split[1];
		String Futureday = split[0]; 
		
		String monthLetter=monthName.substring(0, 3);
		String dayMonthCombine=monthLetter+" "+Futureday;
		System.out.println("Future date : "+dayMonthCombine);
		
		calendar.add(Calendar.MONTH, 7);
		System.out.println(monthName);
	}

}
