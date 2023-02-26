package Dayz12_String_methods;

public class o1b_equals_method {

	public static void main(String[] args) {
		
		String z  = new String ("YOGESH");	
		String z1 = "yogesh";
		String z2 = "YOGESH";
		String z3 = "YOGESH";

				
		System.out.println(z==z1);             
		System.out.println(z==z2);                 
		System.out.println(z1==z2);	        
		System.out.println(z2==z3);     
		System.out.println();

    //  equlas method is case sensitive
		String s = new String ("YOGESH");
		String s1 = "YOGESH";
		String s2 = "yogesh";
		String s3 = "YOGESH";
		
		System.out.println(s.equals(s1));      
		System.out.println(s.equals(s2));   
		System.out.println(s1.equals(s2));  
		System.out.println(s1.equals(s3));
		System.out.println();

		
	//	equalsIgnoreCase method is not case sensitive
		String x  = new String ("YOGESH");	
		String x1 = "YOGESH";
		String x2 = "yogesh";
	
		System.out.println(x.equalsIgnoreCase(x1));  
		System.out.println(x.equalsIgnoreCase(x2));
		System.out.println(x1.equalsIgnoreCase(x2));

	}

}
