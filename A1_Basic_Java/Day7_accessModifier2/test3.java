package Day7_accessModifier2;

import Day7_accessModifier.sunil;

public class test3 extends sunil    {
	
	public static void main (String [] args) {

		test3 z = new test3 ();

		System.out.println(z.a);                  // public        
		System.out.println(z.b);                  // protected
//		System.out.println(z.c);                  // default
//		System.out.println(z.d);                  // private  
		
	
	}

}
