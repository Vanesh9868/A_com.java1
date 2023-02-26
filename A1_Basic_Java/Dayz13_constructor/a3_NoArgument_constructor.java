package Dayz13_constructor;    // initialising the variable by using the no argument constructor

public class a3_NoArgument_constructor {
	
	String name ;
	int pass ;
	
	int c = 10;
	
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
}
