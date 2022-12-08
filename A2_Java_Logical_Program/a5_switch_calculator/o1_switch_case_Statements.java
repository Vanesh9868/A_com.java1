package a5_switch_calculator;

import java.util.Scanner;

public class o1_switch_case_Statements {
		
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
	 
	 int a = s.nextInt();
	 int b = s.nextInt();
	 String sym = s.next();
	 
	 switch (sym)
	 {
		 case "+" :
		 System.out.println(a+b);
		 break;
		 
		 case "-" :
		 System.out.println(a-b);
		 break;
		 
		 case "*" :
		 System.out.println(a*b);
		 break;
		 
		 case "/" :
		 System.out.println(a/b);
		 break;
		 
		 default :
	     System.out.println("envalid symbol");
	     break;
	 
	 }
	 
	
		
		
	}	


}
