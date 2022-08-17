package Day6_Initialisation;

public class initialisation_in_method {
	
	String a;                   //declaration
	int b;
	
	String m1 ()
	{
		a="m1";                // initialisation	
		return a;
	}

	int m2 ()
	{
		b = 100;
		return b;	
	}

	public static void main(String[] args) {

		initialisation_in_method ref = new initialisation_in_method ();
		
		System.out.println(ref.a);
		System.out.println(ref.b);
		
		
		
	}

}
