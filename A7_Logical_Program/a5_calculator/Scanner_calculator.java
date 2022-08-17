package a5_calculator;

import java.util.Scanner;

public class Scanner_calculator {

	public static void main(String[] args) {

		
	String y;
	
	do
	{
				Scanner s = new Scanner(System.in);       //"system .in" for taking input from user
				
				System.out.println("enter first no");
				int no1=s.nextInt();                        
				
				System.out.println("enter second no");
				int no2=s.nextInt();
				
				System.out.println("select symbol(+,-,/,*)");
				String sym =s.next();
				
				int res;
				
				switch(sym)
				{
					case"+" : res = no1+no2;
					System.out.println("Addition is:"+res);
					break;
					
					case"-" : res = no1-no2;
					System.out.println("subtraction is:"+res);
					break;
					
					case"*" : res = no1*no2;
					System.out.println("multiplication is:"+res);
					break;
					
					case"/" : res = no1/no2;
					System.out.println("division is:"+res);
					break;
					
					default : System.out.println("envalid symbol");
		
		          }
				
				System.out.println("do you want to continue(press Y for yes and N for no)");
			    y = s.next();
				
	}while(y.equals("y")||y.equals("Y"));
		
		
		
		
		
	}

}
