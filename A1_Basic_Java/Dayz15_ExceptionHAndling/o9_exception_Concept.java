package Dayz15_ExceptionHAndling;

public class o9_exception_Concept {

	public static void main(String[] args) {
		
	System.out.println("test1");

		int a =20;
		int b =0;
		int c;
	
	//  int c = a/b;            // Risky code have to write in the try block otherwise
		 					    // it will throw the exception and terminate the flow of execution
	
		try {
			
			 c = a/b;

			System.out.println("Hello");

		}
		catch(Exception e)
		{
			c=a/a;
			System.out.println(e);
		}
	
		
		System.out.println("test2");

	}
	
	
/*
 *>>>try
 *in try we right the "Risky"code which might be give the exception 
 *now the abnormal termination of test case execution is been avoided
 * 
 * >>> exception is an class the exception Thrown by the Risky code from Try block 
 * will be get store in the Exception class
 * 
 * >>> catch
 *in  constructor of catch  we Create an reference of class "Exception "
 *AS The exception thrown by the risky code is get store in the exception class
 *the exception is in the object of Exception class 
 *when we call the reference of exception cass in the catch block 
 *it throws the exception provided by the risky code
 *
 *
 * 
 * 
 */

}
