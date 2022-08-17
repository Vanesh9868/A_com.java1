package Dayz13_constructor;    // initialising the variable by using the no argument constructor

public class a3_NoArgument_constructor {
	
	String name ;
	int pass ;

	public a3_NoArgument_constructor ()
	{
		name="yogesh";
		pass=123456;
	}
	
	public static void main(String[] args) {
	
		a3_NoArgument_constructor ref = new a3_NoArgument_constructor ();
		
		System.out.println(ref.name);
		System.out.println(ref.pass);

	}
	
	
/*
 * the constructor we use to initialise the variable
 * 
 * here we use the ( non argument / non parameterized constructor )
 * to initialize the variable "name" & "pass"
 *  	
 */
	
	


}
