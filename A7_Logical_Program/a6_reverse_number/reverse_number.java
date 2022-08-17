package a6_reverse_number;

public class reverse_number {

	public static void main(String[] args) {

		
		int a=5432;
		
		int rem;
		
		int rev=0;
		
		
		while(a>0)
		{
			
			rem=a%10;                  // R--->5432--2___543--3___54--4___5
			
			rev=rev*10+rem;            // Rev--->2--23...--234....2345
			
			a=a/10;	                   // Q--->543..54...5....0.5
		}
		
		System.out.println(rev);
		
		
	}

}
