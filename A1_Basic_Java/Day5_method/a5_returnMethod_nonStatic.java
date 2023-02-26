package Day5_method;

public class a5_returnMethod_nonStatic {
	
	public int m1 ()
	{
		return 12;
	}
	
	public  int m2 ()
	{
		return 45;
	}
	
	public  int m3 ()
	{
		return 44545;
	}
	

	public static void main(String[] args) {

		a5_returnMethod_nonStatic x = new a5_returnMethod_nonStatic ();
		
		
		System.out.println(x.m1());
		System.out.println(x.m2());
		System.out.println(x.m3());
		
	
	
	
	
	
	}

}


