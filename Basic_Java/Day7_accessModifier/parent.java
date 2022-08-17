package Day7_accessModifier;  //within class access all modifier

public class parent  {
		
	public    int a = 10;
	protected int b = 20;
              int c = 30;
    private   int d = 40;
	
    public static void main(String[] args)   {
    	
  	     parent z = new parent ();
  	
  	    System.out.println(z.a);                //public
	    System.out.println(z.b);                //protected
	    System.out.println(z.c);                //default
     	System.out.println(z.d);                //private
  	    	  
    }
}
