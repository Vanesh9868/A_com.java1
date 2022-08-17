package b1_AbstractClass;

public class moped extends vehicle {

public static void main(String[] args) {
	
		moped x = new moped () ;
	   
		x.start();
	    x.top_speed();
	    x.mileage();
	    
	}

@Override
void start() 
{
	System.out.println("moped starts with self ignition");
}

@Override
void top_speed()
{
	System.out.println("moped top speed 70 ");
}

@Override
void mileage() 
{
	System.out.println("moped mileage 40");
}














}
