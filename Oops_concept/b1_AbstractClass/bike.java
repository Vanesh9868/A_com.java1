package b1_AbstractClass;

public class bike extends vehicle {

public static void main(String[] args) {
	
		bike x = new bike ();
		
		x.start();
        x.top_speed();
        x.mileage();
		x.yogesh();
}

@Override
void start() 
{
	System.out.println("bike starts with kick");
}

@Override
void top_speed() 
{
	System.out.println("bike top_speed 110");
}

@Override
void mileage()
{
     System.out.println("bike mileage 40");
}


	
}
