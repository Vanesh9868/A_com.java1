package c1_overloadind;    // change the number of argument

public class apache_NoOfArgument_change {
	
	public void run (int a,int b) 
	{
		System.out.println("run at 60");
	}
	public void run (int a)
	{
		System.out.println("run at 120");
	}

	public static void main(String[] args) {

		apache_NoOfArgument_change X = new apache_NoOfArgument_change();
		
		X.run(12,11);
		X.run(12);
		
		
		
	}

}
