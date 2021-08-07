package naveenChalange;

public class LeapYear {

	public static void main(String[] args) {
		
		//any year divisible by 4 and all century year divisible by 400
		
		int year=2021;
		boolean leap=false;
		
		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					leap=true;
				}else
				{
					leap=false;
				}
			}else
			{
				leap=true;
			}
			if(leap) {
				System.out.println(year+ " is a leap year");
			}else
			{
				System.out.println(year+ " is not a leap year");
			}
		}
		
		

	}

}
