package b2_interface;

public class parent implements child1,child2,child3 {
	
	public child1 click()
	{
		return null ;
	}

	public static void main(String[] args) {
		
		parent z = new parent ();
		
		z.mulga1();
		z.mulga2();
		z.mulga3();
		z.click();
	}


	@Override
	public void mulga1()
	{
         System.out.println(" mulga1 = i am engineer ");		
	}
	

	@Override
	public void mulga2()
	{
         System.out.println(" mulga3 = i am driver ");		
	}
	
	@Override
	public void mulga3() 
	{
		System.out.println(" mulga3 = i am doctor ");
	}

	
	
}
