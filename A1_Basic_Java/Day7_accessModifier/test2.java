package Day7_accessModifier;  //within package can't access private modifier

public class test2 {  
	
    public static void main(String[] args)   {
    	
    	sunil z = new sunil ();  //create object of parent class 
    	
    	System.out.println(z.a);                //public
    	System.out.println(z.b);                //protected
    	System.out.println(z.c);                //default
  //  	System.out.println(z.d);                //private
    	    	
    }

 }

