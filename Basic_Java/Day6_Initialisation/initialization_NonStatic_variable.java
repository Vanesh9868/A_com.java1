package Day6_Initialisation;

public class initialization_NonStatic_variable {

	String name ;                                     // declaration of the variable
	int password;
	String Button ;
	
	public static void main(String[] args) {
		
		initialization_NonStatic_variable ref = new initialization_NonStatic_variable ();
		
		ref.name="yogesh";                            //  initialisation of object
		ref.password=123456;
		ref.Button="click";
		
		System.out.println(ref.name);
        System.out.println(ref.password);
        System.out.println(ref.Button);
        
	}

}
