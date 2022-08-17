package Day4_method;       //static method

public class a1_staticMethod {
	
		
	public static void cat   ()
	{
		System.out.println("eat milk ");
	}   
	
	public static void horse ()
	{
		System.out.println("run fast");
	}
	
	public static void birds () 
	{
		System.out.println("fly in sky");
	}

	
	public static void main(String[] args) { 
	
		    a1_staticMethod.cat  ();               //class name.method name();
			a1_staticMethod.horse ();
			a1_staticMethod.birds ();
			
			a1_staticMethod x = new a1_staticMethod ();
			
			x.cat();
			
	}

}

