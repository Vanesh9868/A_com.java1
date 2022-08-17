package a3_Prime_number;

import java.util.Scanner;

public class prime_scanner {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		
		System.out.println("enter a no");
		
		int no = s.nextInt();
		
		String y;
		
		
	    int a= 15;
		
		int k=0;
		
		for(int i =2;i<a;i++)        // if condition true go inside loop
		{
			
			if(a%i==0)                // condition true go inside block
			{
				k=1;
			}	
			
		}
		
		
		if(k>0)
		{
			System.out.println("not a prime number");
		}
		else
		{
			System.out.println("prime number");
		}
		
		System.out.println("do you want to continue(press Y for yes and N for no)");
		
		y=s.next();
		
	
	}

}
