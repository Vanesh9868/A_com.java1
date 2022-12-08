package a2_looping_statements_program;

public class a5_reverse_number {
	
	static int a;
  
	public static void main(String[] args) {
		
		int a=1234;
		int rev = 0;
		int rem = 10;
	
		while(a>0)
		{	
			rem=a%10; 
			rev=rev*10+rem;			
			a=a/10;
		}
		System.out.println(rev);		

		
}

}




