package Day4_Initialisation;

public class o2_nonStatic_declaration {
	
	int a ;
	int b ;
	int c ;

	public static void main(String[] args) {

		o2_nonStatic_declaration x = new o2_nonStatic_declaration ();
		
		x.a=100;
		x.b=200;
		x.c=300;
		
		
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
		
		
	}
	
	

}
