package c1_overloadind;

public class overloaded_method {
	
	public void run (int a)
	{
		System.out.println("slow");
	}
	
	public void run (String b)
	{
		System.out.println("medium");
	}
	
	public void run (int c,String b)
	{
		System.out.println("fast");
	}

	public void run (String b , int a)
	{
		System.out.println("fastest");
	}
	
	public static void main(String[] args) {

		overloaded_method obj = new overloaded_method ();
		
		obj.run(0);
		obj.run("vghh");
		obj.run(0, "ggh");
		obj.run("ghg",10);
		
		
		
	}

}
