package c2_overRiding;

public class child extends parent {
	
	public void eat()
	{
		System.out.println("i am child");
	}

	public static void main(String[] args) {

		child x = new child ();
				
		x.eat();

	}

}
