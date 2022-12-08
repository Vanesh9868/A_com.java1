package Day6_parameterazition;

public class parameter {
	
	int add (int a,int b) 
	{	
		return a+b;	
	}
		
	int sub (int a,int b) 
	{	
		return a-b;	
	}
	
	int mul (int a,int b)
	{	
		return a*b;	
	}
	
	int div (int a,int b) 
	{	
		return a/b;	
	}
	
	int mod (int a,int b)
	{	
		return a%b;	
	}
	
	public static void main(String[] args) {

		parameter obj = new parameter ();
		
		System.out.println(obj.add(10, 20));
		System.out.println(obj.sub(20, 10));
		System.out.println(obj.mul(10, 20));
		System.out.println(obj.div(20, 10));
		System.out.println(obj.mod(20, 10));
	    
		
	}

}
