package a5_calculator;

public class calculator {
		
	public static void main(String[] args) {
		
		
	 int no1=10;
	 int no2=20;
	 int res;
	 
	 String sym="-";
	 
	 switch(sym)
	 {
		 case "+" : res =no1+no2;	
		 System.out.println(res);
		 break;
		 
		 case "-" : res =no1-no2;	
		 System.out.println(res);
		 break;
//		 
//		 case "*" : res =no1*no2;	
//		 System.out.println(res);
//		 break;
//		 
//		 case "/" : res =no1/no2;	
//		 System.out.println(res);
//		 break;
//		 
		 default : System.out.println("invalid symbol");	
		 break;
		 
	 }
		
		
	}


}
