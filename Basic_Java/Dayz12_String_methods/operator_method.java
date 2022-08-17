package Dayz12_String_methods;

public class operator_method {

	public static void main(String[] args) {
		
/*
 * 
 * >>> After below "3" conditions are true then == operator give the answer true **
 * 
 *  1. methods by which data is store should same
 *     either by using "new" keyword method or 
 *     by using "literals" methods
 *     
 *  2. the data save in both the string should be same
 *   
 *  3. the data save in both the string must be casesensitive
 *     either in upper case or in lower case
 *    
 *   
 */

		String s  = new String ("YOGESH");	
		String s1 = "YOGESH";
		String s2 = "yogesh";
		String s3 = "YOGESH";
		String s4 = "dhanraj";
		String s5 = new String ("YOGESH");
		
				
		System.out.println(s==s1);             // ==...methods are different
		System.out.println(s==s2);             // ==...methods different + not case sensitive     
		System.out.println(s1==s2);	           // ==...not case sensitive
		System.out.println(s3==s4);            // ==...data is not same
		
		System.out.println(s1==s3);            // ==...data same + method same  + case sensitive
		
		System.out.println(s==s5);
				

	}

}
