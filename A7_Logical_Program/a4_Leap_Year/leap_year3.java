package a4_Leap_Year;

public class leap_year3 {

	public static void main(String[] args) {


		int year = 2016;
		
		if ((year%4==0)  && (year%100!=0) || (year%400==0))
		{
			System.out.println("leap year");
		}
		else 
		{
			System.out.println("not a leap year");
		}
	}

}
