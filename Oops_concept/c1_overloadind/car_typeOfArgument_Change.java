package c1_overloadind;  // change the type of argument

public class car_typeOfArgument_Change {
	
	
	public void run (int a) 
	{
		System.out.println(150 );
	}

	public void run (String b) 
	{	
		System.out.println(75);
	}
	
	public static void main(String[] args) {

		car_typeOfArgument_Change obj = new car_typeOfArgument_Change();
		
		obj.run(01);
		obj.run("od");
	}

}
