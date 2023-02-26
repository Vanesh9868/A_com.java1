package Dayz13_constructor;

public class demo {
	
	int a;
	int b;
	int c;	
	
	public  void m1 ()
	{
		System.out.println(a);
	}
	
	public  void m2 ()
	{
		System.out.println(b);
	}
	
	public  void m3 ()
	{
		System.out.println(c);
	}
	
	public  void run (int a , int b , int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		
		m1();
		m2();
		m3();	
	
	}
	
	

	public static void main(String[] args) {
	
		demo x = new demo ();
		
		x.run(10, 20, 30);
		


	}

}
