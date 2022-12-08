package a1_conditional_statmenets;

public class o5_leap_year3 {

	public static void main(String[] args) {


		int year = 2016;
		
		if ((year%4==0)  && (year%100!=0)|| (year%400==0) )
		{
			System.out.println("leap year");
		}
		else 
		{
			System.out.println("not a leap year");
		}
		
		
	}
	
	
/*
 * 
 * for leap year below 3 condition must satisfy
 * 1.number should be divisible by 4 (means number after divide by 4 reminder is 0 ) 
 * 2.number should not be divisble by 100 ( means after number divide by 100 reminder is not 0 )
 * 3.but if any number divisble by 100 and also divisible by 400 then it is prime number  
 * 	
 * 
 */

}
