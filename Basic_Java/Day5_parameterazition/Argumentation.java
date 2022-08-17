package Day5_parameterazition;

public class Argumentation {
	
	void m2 (String a)
	{
		System.out.println("yogesh");
	}
	
	void m2 (int b)
	{
		System.out.println("sunil");
	}
	
	void m2 ()
	{
		System.out.println("milya");
	}
	
	void m2 (String a , int b)
	{
		System.out.println("dhanya");
	}
	
	public static void main (String [] a) {
		
		Argumentation obj = new Argumentation ();
		
		obj.m2("sddsh");
		obj.m2(12);
		obj.m2();
		obj.m2("hjs", 12);
		
		
		
		
	}
	
}
