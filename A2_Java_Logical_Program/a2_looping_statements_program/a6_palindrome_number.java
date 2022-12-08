package a2_looping_statements_program;

import java.util.Scanner;

public class a6_palindrome_number {

	public static void main(String[] args) {

		
		int no =323;
		int a =no;
		int rev =0; 
		int rem;
		
		while(a>0)
		{
			rem=a%10;
			rev=rev*10+rem;
			
			a=a/10;
		}
		
		if(no==rev)
		{
			System.out.println(no+" is palindrome number");
		}
		else
		{
			System.out.println(no+" is not a palindrome number");
		}
		
		
}

}
