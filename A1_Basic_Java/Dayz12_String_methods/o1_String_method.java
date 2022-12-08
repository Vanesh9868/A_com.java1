package Dayz12_String_methods;

public class o1_String_method {

	public static void main(String[] args) {
		
		String x = new String ();
		
		System.out.println(x.length());
		
		String yogi = "Yogesh";
		String  dj  = "dhanraj";
		String sam  = "DHANRAJ";
	    String pk   = "    purshottam ";
	    String rohit   = ""; 

		System.out.println(yogi);
	    System.out.println(yogi.length());	                  
	    System.out.println(yogi.toLowerCase());       
	    System.out.println(yogi.toUpperCase());       
	    System.out.println();

	    System.out.println(yogi.indexOf("s"));         
	    System.out.println(yogi.charAt(5));          
	    System.out.println(yogi.contains("Yogesh"));       
	    System.out.println(yogi.startsWith("Yog"));  
	    System.out.println(yogi.endsWith("sh"));     
	    System.out.println();
	    
	    System.out.println(dj.equalsIgnoreCase(sam));  
	    System.out.println(yogi.concat(dj));           
	    System.out.println(yogi.concat(dj).concat(sam));
	    System.out.println(sam.isEmpty());            
	    System.out.println(rohit.isEmpty());           
	    System.out.println(pk);
	    System.out.println(pk.trim());                
	    System.out.println();	    
		

	}

}
