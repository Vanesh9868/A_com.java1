package Dayz12_String_methods;

public class equalsIgnoreCase {

	public static void main(String[] args) {

		String s  = new String ("YOGESH");	
		String s1 = "YOGESH";
		String s2 = "yogesh";
		String s3 = "YOGESH";
		String s4 = "dhanraj";
		String s5 = new String ("YOGESH");
	
//ignoring the case sensitiveness all
	
		System.out.println(s.equalsIgnoreCase(s1));  
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s.equalsIgnoreCase(s5));
	    System.out.println(s2.equalsIgnoreCase(s4));
		
	}

}
