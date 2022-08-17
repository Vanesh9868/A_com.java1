package a7_Reverse_ByUsing_StringMethods;

public class reverse_string {

	public static void main(String[] args) {

		String x = "yogesh";                 // these name we have to reverse
		
	    int length = x.length();             
		
	    String  rev = "";                    
	    
	    for (int i=length-1 ; i>=0; i--)     
		{									   
	    									 
			rev=rev + x.charAt(i);	
						
		}
		
		System.out.println(rev);

		
	}
	
/* >>>Forloop
 * (1condition max size of variable "i", 
 *  2condition "i>0" if these condition true then only compiler will go inside loop
 *  3condition i-- these will decrement the value of i "which is 
 *  provided in condition1" at each time loop repetes)
 *  
 * >>> lenght method will give the lenght of the value "yogesh" Store in variable x
 * 
 * >>>charAt 
 * these method is from String class
 * these method will give the character  at provided index
 * from the value "yogesh" store in variable x
 *
 * 
 */

}
