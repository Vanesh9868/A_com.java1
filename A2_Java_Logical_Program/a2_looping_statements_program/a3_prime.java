package a2_looping_statements_program;

final public class a3_prime {

	public static void main(String[] args) {

		int a= 101;
		 int k=0;
		
		for(int i =2;i<a;i++)        
		{
			
			if(a%i==0)                
			{
				k=1;
			}	
			
		}
		
		
		if(k==1)
		{
			System.out.println("not a prime number");
		}
		else
		{
			System.out.println("prime number");
		}
	
		
		
	
				
}

}
