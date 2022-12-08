package a4_multiple_inheritance;

public class yogesh implements c1,c2 {

	public static void main(String[] args) {
		
		yogesh x = new yogesh ();
		
		x.a1();
		x.a2();
		x.b1();
		x.b2();
		
		
		

	}

	@Override
	public void b1() 
	{
		System.out.println("b1");
	}

	@Override
	public void b2() 
	{
		System.out.println("b2");
	}


	@Override
	public void a1() 
	{
		System.out.println("a1");
	}

	@Override
	public void a2() 
	{
		System.out.println("a2");
	}


}
