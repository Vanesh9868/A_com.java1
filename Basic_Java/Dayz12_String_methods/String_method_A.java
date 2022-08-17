package Dayz12_String_methods;

public class String_method_A {

	public static void main(String[] args) {
		
		String yogi = "Yogesh";
	
		String  dj  = "dhanraj";
		String sam  = "DHANRAJ";
	    String pk   = "    purshottam ";
	    String rohit   = ""; 

		System.out.println(yogi);
	    System.out.println(yogi.length());	          //Length()
	    System.out.println(yogi.toLowerCase());       //toLowerCase()
	    System.out.println(yogi.toUpperCase());       //toUpperCase()
	    System.out.println();

	    System.out.println(yogi.indexOf("s"));         //indexOF()
	    System.out.println(yogi.charAt(5));           //charAt()
	    System.out.println(yogi.contains("z"));       //contains("")=boolean
	    System.out.println(yogi.startsWith("yog"));   //startsWith("")=boolean
	    System.out.println(yogi.endsWith("sh"));      //endsWith("")=boolean
	    System.out.println();
	    
	    System.out.println(dj.equalsIgnoreCase(sam));  //equalsIgnoreCase()
	    System.out.println(yogi.concat(dj));           //concat()
	    System.out.println(yogi.concat(dj).concat(sam));
	    System.out.println(sam.isEmpty());             //isEmpty()
	    System.out.println(rohit.isEmpty());           //isEmpty()
	    System.out.println(pk);
	    System.out.println(pk.trim());                 //trim()...space
	    
	   
	    
	    String s  = "yogesh123456";	

	    
		String yps []=s.split("3");                    // split();
		
		System.out.println(yps[0]);
		System.out.println(yps[1]);
		

	}

}
