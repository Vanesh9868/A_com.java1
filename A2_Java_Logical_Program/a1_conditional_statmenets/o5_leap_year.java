package a1_conditional_statmenets;

public class o5_leap_year {

	public static void main(String[] args) {

		int year = 4000;

		if (year%4==0)
		{
			
			if (year%100==0)    // if reminder is not 0 then if execute
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
