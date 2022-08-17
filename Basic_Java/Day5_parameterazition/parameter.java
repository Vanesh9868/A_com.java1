package Day5_parameterazition;

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
	
		int add=obj.add(10,20);
		int sub=obj.sub(20, 10);
		int mul=obj.mul(10, 10);
		int div=obj.div(50,3);
		int mod=obj.mod(50, 3);
		
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
		
		
	}

}
