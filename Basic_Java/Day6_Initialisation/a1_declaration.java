package Day6_Initialisation; //1.declaration and initialisation of variable at one place

public class a1_declaration {
	
	String a = "yogesh";              // declaration and initialisation at one place
    int b =100;
    
    String c;                                  //Declairation
	int d;

	public static void main(String[] args) {
		
		a1_declaration x = new a1_declaration ();
		
		x.c="dhanraj";                          // initialisation of Variable
		x.d=50;
		
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
		System.out.println(x.d);




	}

}
