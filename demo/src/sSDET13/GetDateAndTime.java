package sSDET13;

import java.text.SimpleDateFormat;
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
		System.out.println(dayMonth);
	}

}
