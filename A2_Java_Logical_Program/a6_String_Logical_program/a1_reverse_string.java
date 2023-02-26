package a6_String_Logical_program;

public class a1_reverse_string {

	public static void main(String[] args) {

		String x = "yogesh";               
		
	    int length = x.length();             
		
	    String  rev = "";                    
	    
	    for (int i=length-1 ; i>=0; i--)     
		{	
	    	rev=rev+x.charAt(i);
	    	
		}
		
	    	System.out.println(rev);

	}
	
}


