package Day7_accessModifier;  //within class access all modifier

public class sunil  {
		
	public    String a = "public";
	protected String b = "protected";
              String c = "default";
    private   String d = "private";
	
    public static void main(String[] args)   {
    	
  	     sunil z = new sunil ();
  	
  	    System.out.println(z.a);                //public
	    System.out.println(z.b);                //protected
	    System.out.println(z.c);                //default
     	System.out.println(z.d);                //private
  	    	  
    }
}
