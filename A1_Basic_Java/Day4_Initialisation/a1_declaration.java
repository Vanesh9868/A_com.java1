package Day4_Initialisation; //1.declaration and initialisation of variable at one place

public class a1_declaration {
	
	String a = "yogesh";              // declaration and initialisation at one place
    int b =100;
    
    String c;                                  //Declairation
	int d;
	
	static int e;

	public static void main(String[] args) {
		
		a1_declaration x = new a1_declaration ();
		
		x.c="dhanraj";                          // initialisation of Variable
		x.d=50;
		
		int z;
		
		z=100;
		
		a1_declaration.e=544;	
		e=656;
		
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
		System.out.println(x.d);

		System.out.println(a1_declaration.e);
		System.out.println(a1_declaration.e);
		System.out.println(z);
		
		
	


	}

}
