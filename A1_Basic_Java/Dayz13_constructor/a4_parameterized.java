package Dayz13_constructor;

import Day7_accessModifier.sunil;

public class a4_parameterized {
	
	String a;
	String b;
	String c;
	String d;
	String e;


		
	public  a4_parameterized (String a , String b , String c , String d , String e )
	{
				
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		
	}


	public static void main(String[] args) {
				
		a4_parameterized x = new a4_parameterized ("dhanraj", "yogesh", "abhi", "mukesh", "navin");
		
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
		System.out.println(x.d);
		System.out.println(x.e);

		
		

		
		
		
	}

}
