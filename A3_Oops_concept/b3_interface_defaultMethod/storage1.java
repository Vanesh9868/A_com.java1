package b3_interface_defaultMethod;

public interface storage1 {
	
	 default void t1 ()
	{
		System.out.println("t1");
	}
	
	 default void t2 ()
	{
		System.out.println("t2");
	}
	
	 default void t3 ()
	{
		System.out.println("t3");
	}
	
	public static void t4 () 
	{
		System.out.println("m4");
	}
	
	public static void t5 () 
	{
		System.out.println("m5");
	}

	
	
}
