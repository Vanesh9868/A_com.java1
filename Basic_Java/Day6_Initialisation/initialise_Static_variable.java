package Day6_Initialisation;

public class initialise_Static_variable {
	
	static String name ;
	static int   pass ;
	static String button;
	
		String a;
		
	public static void main(String[] args) {
		
		initialise_Static_variable ref = new initialise_Static_variable ();
		
  
		initialise_Static_variable.name = "yogesh";               // can initialise static variable
		pass = 123456;
        button = "click";
		
		
		System.out.println(name);
		System.out.println(pass);
		System.out.println(button);
		
	
		
	}
	
	
	// non static variable we cant initialise dirctly in class or main method
	

}
