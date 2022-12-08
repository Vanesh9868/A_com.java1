package Dayz13_constructor;
public class a4_parameterized_constructor {
	
	String name;
	int    pass;

	public a4_parameterized_constructor (String name , int pass)
	{
		this.name = name;
		this.pass = pass;
	}
		
	public static void main(String[] args) {

  a4_parameterized_constructor ref = new a4_parameterized_constructor ("dhanraj",4545);
	
      System.out.println(ref.name);
      System.out.println(ref.pass);
  
	}



}
