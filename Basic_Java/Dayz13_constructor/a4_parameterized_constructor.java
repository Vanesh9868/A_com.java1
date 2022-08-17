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

  a4_parameterized_constructor ref = new a4_parameterized_constructor ("dhanraj",456123);
	
  
      ref.name="yogesh";
      ref.pass=555555;
  
      ref.name="manish";
      ref. pass=10;
  
      System.out.println(ref.name);
      System.out.println(ref.pass);
  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
 * the constructor we use to initialise the variable
 * 
 * here we use the ( parameterized constructor )
 * to initialize the variable "name" & "pass"
 * 
 * in parameterized constructor we give the parameters/argument inside the 
 * (round bracket / function) of the constructor 
 * 
 * this parameter are the local variable 
 * inside constructor block we give the value of local variable to the instance variable 
 * 
 * the initialisation in parameterized constructor we do in the object creation of class
 * inside the (round block / function ) of object we give the initialisation to the local variable
 * the parameter that we declair in the constructor ( function / roun block )
 * 
 * 
 */


}
