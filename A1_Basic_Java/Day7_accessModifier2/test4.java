package Day7_accessModifier2;  //outside package can acess only public access modifier

import Day7_accessModifier.sunil;

  public class test4  {

	public static void main(String[] args) {

	       
		       sunil z = new sunil ();
		       
		   	System.out.println(z.a);                //public
//	 	    System.out.println(z.b);                //protected
//		   	System.out.println(z.c);                //default
//		   	System.out.println(z.d);                //private
		   	
   
	}
}
