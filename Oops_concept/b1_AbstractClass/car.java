package b1_AbstractClass;

public class car extends vehicle {

	public static void main(String[] args) {

		car z = new car ();
		
		z.start();
		z.top_speed();
		z.mileage();
		
	}

	@Override
	void start() 
	{
        System.out.println("car starts with key");		
	}

	@Override
	void top_speed()
	{
        System.out.println("car top speed 130");		
	}

	@Override
	void mileage() 
	{
         System.out.println("car mileage 25");		
	}

}
