package a4_Leap_Year;

public class Leap_year {

	public static void main(String[] args) {

		int year = 2017;
		
		if (year%4==0)
		{
			if (year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("leap year");
				}
				
				else
				{
 					System.out.println("not a leap year");
				}
				
			}
			
			else 
			{
				System.out.println("leap year");
			}
		}
		else
		{
			System.out.println("not a leap year");
		}
	}
                                                                   
}
