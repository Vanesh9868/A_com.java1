package a3_Prime_number;

public class prime {

	public static void main(String[] args) {


		int a= 13;
		
		int k=0;
		
		for(int i =2;i<a;i++)        // if condition true go inside loop
		{
			
			if(a%i==0)                // condition true go inside block
			{
				k=1;
			}	
			
		}
		
		
		if(k>0)
		{
			System.out.println("not a prime number");
		}
		else
		{
			System.out.println("prime number");
		}
		
	
				
}

}
