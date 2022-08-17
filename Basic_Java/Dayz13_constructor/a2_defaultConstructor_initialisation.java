package Dayz13_constructor;   // initialising the variable by using the default constructor

public class a2_defaultConstructor_initialisation {
	
	String name ;
	int pass ;

	
	
	public static void main(String[] args) {
		
	a2_defaultConstructor_initialisation ref = new a2_defaultConstructor_initialisation ();
		
       System.out.println(ref.name);
       System.out.println(ref.pass);

	}
	
	
/*
 *  the constructor we use to initialise the variable
 * 
 *  here we us the deafault constructor to initialise the variable
 *  "name" & "pass"
 *   
 *  the default contructor is not having the argument so it is same as of 
 *  non parameterized costructor but as it is default constructor 
 *  it initialise the variable with the default value of data type that variable use
 *   
 *  variable "name" use the data type as String , string has deafult value "Null"
 *  and variable "pass" use data type as int and int has default value "0"
 *  so we will  gate the output on console as "null & 0"
 * 
 */


}
