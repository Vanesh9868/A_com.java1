package a5_switch_calculator;

import java.util.Scanner;

public class o2_Scanner_calculator {

	public static void main(String[] args) {
		
	String y;
	
	do
	{
	    Scanner s = new Scanner(System.in);       //"system .in" for taking input from user
		
		System.out.println("enter first no");
		int no1=s.nextInt();      
		
		System.out.println("select symbol(+,-,/,*)");
		String sym =s.next();
		
		System.out.println("enter second no");
		int no2=s.nextInt();
	
		
		switch(sym)
		{
			case"+" : 
			System.out.println(no1+no2);
			break;
			
			case"-" :
			System.out.println(no1-no2);
			break;
			
			case"*" :
			System.out.println(no1*no2);
			break;
			
			case"/" : 
			System.out.println(no1/no2);
			break;
			
			case "%":
			System.out.println(no1%no2);
			break;
			
			default : 
			System.out.println("envalid symbol");
			break;

          }
		
		System.out.println("press Y for continue and N for stop");
		System.out.println();
	    y = s.next();
			
	}
	while(y.equals("y")||y.equals("Y"));
	
	
	
	
		
	}

}


